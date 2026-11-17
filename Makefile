
# Configurações
JAVAC = javac
JAVA = java

SRC_DIR = src
BIN_DIR = bin
MAIN = Main

# Localiza todos os arquivos Java
SOURCES = $(shell find $(SRC_DIR) -name "*.java")

# Diretório de compilação
.PHONY: all compile run clean rebuild

# Compilar o projeto
all: compile

compile:
	@mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $(SOURCES)

# Executar o projeto
run: compile
	$(JAVA) -cp $(BIN_DIR) $(MAIN)

# Limpar arquivos compilados
clean:
	rm -rf $(BIN_DIR)

# Limpar e compilar novamente
rebuild: clean compile
