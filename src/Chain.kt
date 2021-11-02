interface Chain {
    fun request(): Request
    fun proceed(request: Request):Response
    fun connection():Connection
}