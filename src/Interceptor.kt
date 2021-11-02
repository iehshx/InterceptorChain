interface Interceptor {
    fun intercept(chain: Chain): Response
}