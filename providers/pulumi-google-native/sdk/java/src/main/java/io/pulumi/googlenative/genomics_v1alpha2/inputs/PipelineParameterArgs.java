// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.genomics_v1alpha2.inputs.LocalCopyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters facilitate setting and delivering data into the pipeline's execution environment. They are defined at create time, with optional defaults, and can be overridden at run time. If `localCopy` is unset, then the parameter specifies a string that is passed as-is into the pipeline, as the value of the environment variable with the given name. A default value can be optionally specified at create time. The default can be overridden at run time using the inputs map. If no default is given, a value must be supplied at runtime. If `localCopy` is defined, then the parameter specifies a data source or sink, both in Google Cloud Storage and on the Docker container where the pipeline computation is run. The service account associated with the Pipeline (by default the project's Compute Engine service account) must have access to the Google Cloud Storage paths. At run time, the Google Cloud Storage paths can be overridden if a default was provided at create time, or must be set otherwise. The pipeline runner should add a key/value pair to either the inputs or outputs map. The indicated data copies will be carried out before/after pipeline execution, just as if the corresponding arguments were provided to `gsutil cp`. For example: Given the following `PipelineParameter`, specified in the `inputParameters` list: ```{name: "input_file", localCopy: {path: "file.txt", disk: "pd1"}}``` where `disk` is defined in the `PipelineResources` object as: ```{name: "pd1", mountPoint: "/mnt/disk/"}``` We create a disk named `pd1`, mount it on the host VM, and map `/mnt/pd1` to `/mnt/disk` in the docker container. At runtime, an entry for `input_file` would be required in the inputs map, such as: ```inputs["input_file"] = "gs://my-bucket/bar.txt"``` This would generate the following gsutil call: ```gsutil cp gs://my-bucket/bar.txt /mnt/pd1/file.txt``` The file `/mnt/pd1/file.txt` maps to `/mnt/disk/file.txt` in the Docker container. Acceptable paths are: Google Cloud storage pathLocal path file file glob directory For outputs, the direction of the copy is reversed: ```gsutil cp /mnt/disk/file.txt gs://my-bucket/bar.txt``` Acceptable paths are: Local pathGoogle Cloud Storage path file file file directory - directory must already exist glob directory - directory will be created if it doesn't exist One restriction due to docker limitations, is that for outputs that are found on the boot disk, the local path cannot be a glob and must be a file.
 * 
 */
public final class PipelineParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineParameterArgs Empty = new PipelineParameterArgs();

    /**
     * The default value for this parameter. Can be overridden at runtime. If `localCopy` is present, then this must be a Google Cloud Storage path beginning with `gs://`.
     * 
     */
    @Import(name="defaultValue")
      private final @Nullable Output<String> defaultValue;

    public Output<String> getDefaultValue() {
        return this.defaultValue == null ? Output.empty() : this.defaultValue;
    }

    /**
     * Human-readable description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * If present, this parameter is marked for copying to and from the VM. `LocalCopy` indicates where on the VM the file should be. The value given to this parameter (either at runtime or using `defaultValue`) must be the remote path where the file should be.
     * 
     */
    @Import(name="localCopy")
      private final @Nullable Output<LocalCopyArgs> localCopy;

    public Output<LocalCopyArgs> getLocalCopy() {
        return this.localCopy == null ? Output.empty() : this.localCopy;
    }

    /**
     * Name of the parameter - the pipeline runner uses this string as the key to the input and output maps in RunPipeline.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public PipelineParameterArgs(
        @Nullable Output<String> defaultValue,
        @Nullable Output<String> description,
        @Nullable Output<LocalCopyArgs> localCopy,
        Output<String> name) {
        this.defaultValue = defaultValue;
        this.description = description;
        this.localCopy = localCopy;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PipelineParameterArgs() {
        this.defaultValue = Output.empty();
        this.description = Output.empty();
        this.localCopy = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> defaultValue;
        private @Nullable Output<String> description;
        private @Nullable Output<LocalCopyArgs> localCopy;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.localCopy = defaults.localCopy;
    	      this.name = defaults.name;
        }

        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = Output.ofNullable(defaultValue);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder localCopy(@Nullable Output<LocalCopyArgs> localCopy) {
            this.localCopy = localCopy;
            return this;
        }
        public Builder localCopy(@Nullable LocalCopyArgs localCopy) {
            this.localCopy = Output.ofNullable(localCopy);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public PipelineParameterArgs build() {
            return new PipelineParameterArgs(defaultValue, description, localCopy, name);
        }
    }
}
