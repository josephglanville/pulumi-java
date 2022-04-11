// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.BuildSignatureArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Note holding the version of the provider's builder and the signature of the provenance message in the build details occurrence.
 * 
 */
public final class BuildArgs extends io.pulumi.resources.ResourceArgs {

    public static final BuildArgs Empty = new BuildArgs();

    /**
     * Immutable. Version of the builder which produced this build.
     * 
     */
    @Import(name="builderVersion", required=true)
      private final Output<String> builderVersion;

    public Output<String> getBuilderVersion() {
        return this.builderVersion;
    }

    /**
     * Signature of the build in occurrences pointing to this build note containing build details.
     * 
     */
    @Import(name="signature")
      private final @Nullable Output<BuildSignatureArgs> signature;

    public Output<BuildSignatureArgs> getSignature() {
        return this.signature == null ? Codegen.empty() : this.signature;
    }

    public BuildArgs(
        Output<String> builderVersion,
        @Nullable Output<BuildSignatureArgs> signature) {
        this.builderVersion = Objects.requireNonNull(builderVersion, "expected parameter 'builderVersion' to be non-null");
        this.signature = signature;
    }

    private BuildArgs() {
        this.builderVersion = Codegen.empty();
        this.signature = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> builderVersion;
        private @Nullable Output<BuildSignatureArgs> signature;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builderVersion = defaults.builderVersion;
    	      this.signature = defaults.signature;
        }

        public Builder builderVersion(Output<String> builderVersion) {
            this.builderVersion = Objects.requireNonNull(builderVersion);
            return this;
        }
        public Builder builderVersion(String builderVersion) {
            this.builderVersion = Output.of(Objects.requireNonNull(builderVersion));
            return this;
        }
        public Builder signature(@Nullable Output<BuildSignatureArgs> signature) {
            this.signature = signature;
            return this;
        }
        public Builder signature(@Nullable BuildSignatureArgs signature) {
            this.signature = Codegen.ofNullable(signature);
            return this;
        }        public BuildArgs build() {
            return new BuildArgs(builderVersion, signature);
        }
    }
}
