export class ProductContent{

    constructor(
        public content:Product[]
    ){

    }

}

export class Product{
    constructor(
        public title?:string,
        public description?:string,
        public price?:number
    ){

    }
}