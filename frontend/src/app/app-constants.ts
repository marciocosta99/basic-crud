export class AppConstants{
    public static get baseURL(): string {return "http://localhost:8080"}
    public static get baseUsers(): string {return this.baseURL + "users"}
}