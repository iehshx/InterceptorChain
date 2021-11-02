class Interceptor2 : Interceptor {
    override fun intercept(chain: Chain): Response {
        chain.request().requestParams = chain.request().requestParams + "Interceptor2."
        println("Interceptor2")
        return chain.proceed(chain.request())
    }
}