// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxEntityTypeExcludedPhraseArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxEntityTypeExcludedPhraseArgs Empty = new CxEntityTypeExcludedPhraseArgs();

    /**
     * The word or phrase to be excluded.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public CxEntityTypeExcludedPhraseArgs(@Nullable Output<String> value) {
        this.value = value;
    }

    private CxEntityTypeExcludedPhraseArgs() {
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxEntityTypeExcludedPhraseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(CxEntityTypeExcludedPhraseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public CxEntityTypeExcludedPhraseArgs build() {
            return new CxEntityTypeExcludedPhraseArgs(value);
        }
    }
}
