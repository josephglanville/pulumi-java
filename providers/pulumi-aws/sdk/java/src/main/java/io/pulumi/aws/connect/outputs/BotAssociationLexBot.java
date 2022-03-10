// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotAssociationLexBot {
    /**
     * The Region that the Amazon Lex (V1) bot was created in. Defaults to current region.
     * 
     */
    private final @Nullable String lexRegion;
    /**
     * The name of the Amazon Lex (V1) bot.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private BotAssociationLexBot(
        @OutputCustomType.Parameter("lexRegion") @Nullable String lexRegion,
        @OutputCustomType.Parameter("name") String name) {
        this.lexRegion = lexRegion;
        this.name = name;
    }

    /**
     * The Region that the Amazon Lex (V1) bot was created in. Defaults to current region.
     * 
    */
    public Optional<String> getLexRegion() {
        return Optional.ofNullable(this.lexRegion);
    }
    /**
     * The name of the Amazon Lex (V1) bot.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAssociationLexBot defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lexRegion;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAssociationLexBot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lexRegion = defaults.lexRegion;
    	      this.name = defaults.name;
        }

        public Builder setLexRegion(@Nullable String lexRegion) {
            this.lexRegion = lexRegion;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public BotAssociationLexBot build() {
            return new BotAssociationLexBot(lexRegion, name);
        }
    }
}
