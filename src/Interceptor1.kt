class Interceptor1 : Interceptor {
    override fun intercept(chain: Chain): Response {
        val request = chain.request()
        request.requestParams = request.requestParams + ",Interceptor1,"
        println("Interceptor1")
        return chain.proceed(request)
    }
}