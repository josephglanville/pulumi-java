// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.OperatingSystemType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DockerImagePlatformArgs extends io.pulumi.resources.ResourceArgs {

    public static final DockerImagePlatformArgs Empty = new DockerImagePlatformArgs();

    /**
     * The OS type the Environment.
     * 
     */
    @Import(name="operatingSystemType")
      private final @Nullable Output<Either<String,OperatingSystemType>> operatingSystemType;

    public Output<Either<String,OperatingSystemType>> getOperatingSystemType() {
        return this.operatingSystemType == null ? Codegen.empty() : this.operatingSystemType;
    }

    public DockerImagePlatformArgs(@Nullable Output<Either<String,OperatingSystemType>> operatingSystemType) {
        this.operatingSystemType = operatingSystemType;
    }

    private DockerImagePlatformArgs() {
        this.operatingSystemType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerImagePlatformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,OperatingSystemType>> operatingSystemType;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerImagePlatformArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operatingSystemType = defaults.operatingSystemType;
        }

        public Builder operatingSystemType(@Nullable Output<Either<String,OperatingSystemType>> operatingSystemType) {
            this.operatingSystemType = operatingSystemType;
            return this;
        }
        public Builder operatingSystemType(@Nullable Either<String,OperatingSystemType> operatingSystemType) {
            this.operatingSystemType = Codegen.ofNullable(operatingSystemType);
            return this;
        }        public DockerImagePlatformArgs build() {
            return new DockerImagePlatformArgs(operatingSystemType);
        }
    }
}
