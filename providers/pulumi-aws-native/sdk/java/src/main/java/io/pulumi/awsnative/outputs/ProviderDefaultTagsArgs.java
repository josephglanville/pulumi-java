// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.outputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ProviderDefaultTagsArgs {
    /**
     * A group of tags to set across all resources.
     * 
     */
    private final @Nullable Output<Map<String,String>> tags;

    @CustomType.Constructor
    private ProviderDefaultTagsArgs(@CustomType.Parameter("tags") @Nullable Output<Map<String,String>> tags) {
        this.tags = tags;
    }

    /**
     * A group of tags to set across all resources.
     * 
    */
    public @Nullable Output<Map<String,String>> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderDefaultTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderDefaultTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }        public ProviderDefaultTagsArgs build() {
            return new ProviderDefaultTagsArgs(tags);
        }
    }
}
