import java.lang.AssertionError

class InterceptorChain : Chain {
    var interceptors = ArrayList<Interceptor>()
    var request: Request
    var index = 0

    constructor(interceptors: ArrayList<Interceptor>, request: Request, index: Int = 0) {
        this.interceptors = interceptors
        this.request = request
        this.index = index
    }


    override fun request(): Request {
        return request
    }

    override fun proceed(request: Request): Response {
        if (index >= interceptors.size) {
            throw AssertionError()
        }
        val next = InterceptorChain(interceptors, request, index + 1)
        val interceptor = interceptors[index]
        return interceptor.intercept(next)
    }

    override fun connection(): Connection = Connection()
}