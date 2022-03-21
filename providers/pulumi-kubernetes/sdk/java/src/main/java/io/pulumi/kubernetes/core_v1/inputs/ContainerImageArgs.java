// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describe a container image
 * 
 */
public final class ContainerImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerImageArgs Empty = new ContainerImageArgs();

    /**
     * Names by which this image is known. e.g. ["k8s.gcr.io/hyperkube:v1.0.7", "dockerhub.io/google_containers/hyperkube:v1.0.7"]
     * 
     */
    @Import(name="names", required=true)
      private final Output<List<String>> names;

    public Output<List<String>> getNames() {
        return this.names;
    }

    /**
     * The size of the image in bytes.
     * 
     */
    @Import(name="sizeBytes")
      private final @Nullable Output<Integer> sizeBytes;

    public Output<Integer> getSizeBytes() {
        return this.sizeBytes == null ? Output.empty() : this.sizeBytes;
    }

    public ContainerImageArgs(
        Output<List<String>> names,
        @Nullable Output<Integer> sizeBytes) {
        this.names = Objects.requireNonNull(names, "expected parameter 'names' to be non-null");
        this.sizeBytes = sizeBytes;
    }

    private ContainerImageArgs() {
        this.names = Output.empty();
        this.sizeBytes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> names;
        private @Nullable Output<Integer> sizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.names = defaults.names;
    	      this.sizeBytes = defaults.sizeBytes;
        }

        public Builder names(Output<List<String>> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Output.of(Objects.requireNonNull(names));
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder sizeBytes(@Nullable Output<Integer> sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Builder sizeBytes(@Nullable Integer sizeBytes) {
            this.sizeBytes = Output.ofNullable(sizeBytes);
            return this;
        }        public ContainerImageArgs build() {
            return new ContainerImageArgs(names, sizeBytes);
        }
    }
}
