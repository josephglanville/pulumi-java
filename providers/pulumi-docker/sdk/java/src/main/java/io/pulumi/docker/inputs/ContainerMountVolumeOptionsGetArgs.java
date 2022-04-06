// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.docker.inputs.ContainerMountVolumeOptionsLabelGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerMountVolumeOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerMountVolumeOptionsGetArgs Empty = new ContainerMountVolumeOptionsGetArgs();

    @Import(name="driverName")
      private final @Nullable Output<String> driverName;

    public Output<String> getDriverName() {
        return this.driverName == null ? Output.empty() : this.driverName;
    }

    @Import(name="driverOptions")
      private final @Nullable Output<Map<String,String>> driverOptions;

    public Output<Map<String,String>> getDriverOptions() {
        return this.driverOptions == null ? Output.empty() : this.driverOptions;
    }

    @Import(name="labels")
      private final @Nullable Output<List<ContainerMountVolumeOptionsLabelGetArgs>> labels;

    public Output<List<ContainerMountVolumeOptionsLabelGetArgs>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="noCopy")
      private final @Nullable Output<Boolean> noCopy;

    public Output<Boolean> getNoCopy() {
        return this.noCopy == null ? Output.empty() : this.noCopy;
    }

    public ContainerMountVolumeOptionsGetArgs(
        @Nullable Output<String> driverName,
        @Nullable Output<Map<String,String>> driverOptions,
        @Nullable Output<List<ContainerMountVolumeOptionsLabelGetArgs>> labels,
        @Nullable Output<Boolean> noCopy) {
        this.driverName = driverName;
        this.driverOptions = driverOptions;
        this.labels = labels;
        this.noCopy = noCopy;
    }

    private ContainerMountVolumeOptionsGetArgs() {
        this.driverName = Output.empty();
        this.driverOptions = Output.empty();
        this.labels = Output.empty();
        this.noCopy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerMountVolumeOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> driverName;
        private @Nullable Output<Map<String,String>> driverOptions;
        private @Nullable Output<List<ContainerMountVolumeOptionsLabelGetArgs>> labels;
        private @Nullable Output<Boolean> noCopy;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerMountVolumeOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverName = defaults.driverName;
    	      this.driverOptions = defaults.driverOptions;
    	      this.labels = defaults.labels;
    	      this.noCopy = defaults.noCopy;
        }

        public Builder driverName(@Nullable Output<String> driverName) {
            this.driverName = driverName;
            return this;
        }
        public Builder driverName(@Nullable String driverName) {
            this.driverName = Output.ofNullable(driverName);
            return this;
        }
        public Builder driverOptions(@Nullable Output<Map<String,String>> driverOptions) {
            this.driverOptions = driverOptions;
            return this;
        }
        public Builder driverOptions(@Nullable Map<String,String> driverOptions) {
            this.driverOptions = Output.ofNullable(driverOptions);
            return this;
        }
        public Builder labels(@Nullable Output<List<ContainerMountVolumeOptionsLabelGetArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<ContainerMountVolumeOptionsLabelGetArgs> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder labels(ContainerMountVolumeOptionsLabelGetArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder noCopy(@Nullable Output<Boolean> noCopy) {
            this.noCopy = noCopy;
            return this;
        }
        public Builder noCopy(@Nullable Boolean noCopy) {
            this.noCopy = Output.ofNullable(noCopy);
            return this;
        }        public ContainerMountVolumeOptionsGetArgs build() {
            return new ContainerMountVolumeOptionsGetArgs(driverName, driverOptions, labels, noCopy);
        }
    }
}