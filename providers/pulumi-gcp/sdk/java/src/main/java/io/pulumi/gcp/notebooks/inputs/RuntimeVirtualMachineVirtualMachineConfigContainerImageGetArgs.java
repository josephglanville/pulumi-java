// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs Empty = new RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs();

    /**
     * The path to the container image repository.
     * For example: gcr.io/{project_id}/{imageName}
     * 
     */
    @InputImport(name="repository", required=true)
      private final Output<String> repository;

    public Output<String> getRepository() {
        return this.repository;
    }

    /**
     * The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    @InputImport(name="tag")
      private final @Nullable Output<String> tag;

    public Output<String> getTag() {
        return this.tag == null ? Output.empty() : this.tag;
    }

    public RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs(
        Output<String> repository,
        @Nullable Output<String> tag) {
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
        this.tag = tag;
    }

    private RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs() {
        this.repository = Output.empty();
        this.tag = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> repository;
        private @Nullable Output<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
        }

        public Builder repository(Output<String> repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }

        public Builder repository(String repository) {
            this.repository = Output.of(Objects.requireNonNull(repository));
            return this;
        }

        public Builder tag(@Nullable Output<String> tag) {
            this.tag = tag;
            return this;
        }

        public Builder tag(@Nullable String tag) {
            this.tag = Output.ofNullable(tag);
            return this;
        }
        public RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs build() {
            return new RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs(repository, tag);
        }
    }
}
