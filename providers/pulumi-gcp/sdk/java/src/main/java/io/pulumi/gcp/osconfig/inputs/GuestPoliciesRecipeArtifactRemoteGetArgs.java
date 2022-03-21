// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeArtifactRemoteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeArtifactRemoteGetArgs Empty = new GuestPoliciesRecipeArtifactRemoteGetArgs();

    /**
     * Must be provided if allowInsecure is false. SHA256 checksum in hex format, to compare to the checksum of the artifact.
     * If the checksum is not empty and it doesn't match the artifact then the recipe installation fails before running any
     * of the steps.
     * 
     */
    @Import(name="checkSum")
      private final @Nullable Output<String> checkSum;

    public Output<String> getCheckSum() {
        return this.checkSum == null ? Output.empty() : this.checkSum;
    }

    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format {protocol}://{location}.
     * 
     */
    @Import(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> getUri() {
        return this.uri == null ? Output.empty() : this.uri;
    }

    public GuestPoliciesRecipeArtifactRemoteGetArgs(
        @Nullable Output<String> checkSum,
        @Nullable Output<String> uri) {
        this.checkSum = checkSum;
        this.uri = uri;
    }

    private GuestPoliciesRecipeArtifactRemoteGetArgs() {
        this.checkSum = Output.empty();
        this.uri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeArtifactRemoteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> checkSum;
        private @Nullable Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeArtifactRemoteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkSum = defaults.checkSum;
    	      this.uri = defaults.uri;
        }

        public Builder checkSum(@Nullable Output<String> checkSum) {
            this.checkSum = checkSum;
            return this;
        }
        public Builder checkSum(@Nullable String checkSum) {
            this.checkSum = Output.ofNullable(checkSum);
            return this;
        }
        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = Output.ofNullable(uri);
            return this;
        }        public GuestPoliciesRecipeArtifactRemoteGetArgs build() {
            return new GuestPoliciesRecipeArtifactRemoteGetArgs(checkSum, uri);
        }
    }
}
