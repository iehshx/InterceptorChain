class RealCall(override var request: Request) : Call {
    override fun getResponseWithInterceptorChain(): Response {
        val interceptors = ArrayList<Interceptor>()
        interceptors.add(Interceptor1())
        interceptors.add(Interceptor2())
        interceptors.add(EndInterceptor())
        val chain = InterceptorChain(interceptors, request)
        return chain.proceed(request)
    }
}