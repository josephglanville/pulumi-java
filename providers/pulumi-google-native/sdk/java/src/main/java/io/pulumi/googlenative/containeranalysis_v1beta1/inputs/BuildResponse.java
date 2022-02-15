// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.BuildSignatureResponse;
import java.lang.String;
import java.util.Objects;


public final class BuildResponse extends io.pulumi.resources.InvokeArgs {

    public static final BuildResponse Empty = new BuildResponse();

    @InputImport(name="builderVersion", required=true)
    private final String builderVersion;

    public String getBuilderVersion() {
        return this.builderVersion;
    }

    @InputImport(name="signature", required=true)
    private final BuildSignatureResponse signature;

    public BuildSignatureResponse getSignature() {
        return this.signature;
    }

    public BuildResponse(
        String builderVersion,
        BuildSignatureResponse signature) {
        this.builderVersion = Objects.requireNonNull(builderVersion, "expected parameter 'builderVersion' to be non-null");
        this.signature = Objects.requireNonNull(signature, "expected parameter 'signature' to be non-null");
    }

    private BuildResponse() {
        this.builderVersion = null;
        this.signature = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String builderVersion;
        private BuildSignatureResponse signature;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builderVersion = defaults.builderVersion;
    	      this.signature = defaults.signature;
        }

        public Builder setBuilderVersion(String builderVersion) {
            this.builderVersion = Objects.requireNonNull(builderVersion);
            return this;
        }

        public Builder setSignature(BuildSignatureResponse signature) {
            this.signature = Objects.requireNonNull(signature);
            return this;
        }

        public BuildResponse build() {
            return new BuildResponse(builderVersion, signature);
        }
    }
}