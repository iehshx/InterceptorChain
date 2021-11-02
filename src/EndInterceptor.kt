class EndInterceptor : Interceptor {
    override fun intercept(chain: Chain): Response {
        val response: Response = Response()
        println("response = $response")
        return response
    }
}