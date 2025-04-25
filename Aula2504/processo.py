class Processo:
    def __init__(self, id, descricao):
        self.id = id
        self.descricao = descricao


    def __eq__(self, outro):
        if isinstance(outro, Processo):
            return self.id == outro.id
        return False
    

    def __repr__(self):
        return f'id = {self.id}, descricao = {self.descricao}'
    