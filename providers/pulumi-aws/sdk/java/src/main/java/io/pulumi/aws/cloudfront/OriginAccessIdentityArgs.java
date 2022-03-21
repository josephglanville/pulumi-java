// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OriginAccessIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginAccessIdentityArgs Empty = new OriginAccessIdentityArgs();

    /**
     * An optional comment for the origin access identity.
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> getComment() {
        return this.comment == null ? Output.empty() : this.comment;
    }

    public OriginAccessIdentityArgs(@Nullable Output<String> comment) {
        this.comment = comment;
    }

    private OriginAccessIdentityArgs() {
        this.comment = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginAccessIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comment;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginAccessIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
        }

        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Output.ofNullable(comment);
            return this;
        }        public OriginAccessIdentityArgs build() {
            return new OriginAccessIdentityArgs(comment);
        }
    }
}
