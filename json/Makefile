BIN = bin/
JFLAGS = -g -cp lib/fastjson-1.1.17.jar -d ./$(BIN)
JC = javac
JAR = jar

#
# CLASSES is a macro consisting of 4 words (one for each java source file)
#

CLASSES = \
  src/MemberId.java 



# the default make target entry
all: classes

classes: $(CLASSES:%.java=$(BIN)%.class)
$(BIN)%.class: %.java
	$(JC) $(JFLAGS) $<

jar: 
	jar -cvfm memberid.jar manifest.mf -C bin/ .

clean:
	@find ./$(BIN) -iname '*.class' -delete
