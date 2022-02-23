// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The type of the pattern for an alias path.
 * 
 */
public final class AliasPatternResponse extends io.pulumi.resources.InvokeArgs {

    public static final AliasPatternResponse Empty = new AliasPatternResponse();

    /**
     * The alias pattern phrase.
     * 
     */
    @InputImport(name="phrase")
      private final @Nullable String phrase;

    public Optional<String> getPhrase() {
        return this.phrase == null ? Optional.empty() : Optional.ofNullable(this.phrase);
    }

    /**
     * The type of alias pattern
     * 
     */
    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * The alias pattern variable.
     * 
     */
    @InputImport(name="variable")
      private final @Nullable String variable;

    public Optional<String> getVariable() {
        return this.variable == null ? Optional.empty() : Optional.ofNullable(this.variable);
    }

    public AliasPatternResponse(
        @Nullable String phrase,
        @Nullable String type,
        @Nullable String variable) {
        this.phrase = phrase;
        this.type = type;
        this.variable = variable;
    }

    private AliasPatternResponse() {
        this.phrase = null;
        this.type = null;
        this.variable = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasPatternResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String phrase;
        private @Nullable String type;
        private @Nullable String variable;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasPatternResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phrase = defaults.phrase;
    	      this.type = defaults.type;
    	      this.variable = defaults.variable;
        }

        public Builder setPhrase(@Nullable String phrase) {
            this.phrase = phrase;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setVariable(@Nullable String variable) {
            this.variable = variable;
            return this;
        }
        public AliasPatternResponse build() {
            return new AliasPatternResponse(phrase, type, variable);
        }
    }
}
