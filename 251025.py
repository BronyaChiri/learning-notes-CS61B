class Dog:
    def __init__(self,weight):
        self.weight = weight 

    def make_noise(self):
        if self.weight<=10:
            print("yinyinyin")
        elif self.weight<=50:
            print("barkbark")
        else:
            print("arooo")

d = Dog(62)
d.make_noise()