import { Carrinho } from "./carrinho"

export class Produto{
    public id:number
    public nome: string
    public precoUnitario:number
    public id_categoria_produto:number
    public imagem_produto:string
    public descricao:string
    public carrinho:Carrinho
}
