// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ResourceRequirementsArgs;
import io.pulumi.kubernetes.core_v1.inputs.TypedLocalObjectReferenceArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PersistentVolumeClaimSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final PersistentVolumeClaimSpecArgs Empty = new PersistentVolumeClaimSpecArgs();

    @InputImport(name="accessModes")
    private final @Nullable Input<List<String>> accessModes;

    public Input<List<String>> getAccessModes() {
        return this.accessModes == null ? Input.empty() : this.accessModes;
    }

    @InputImport(name="dataSource")
    private final @Nullable Input<TypedLocalObjectReferenceArgs> dataSource;

    public Input<TypedLocalObjectReferenceArgs> getDataSource() {
        return this.dataSource == null ? Input.empty() : this.dataSource;
    }

    @InputImport(name="dataSourceRef")
    private final @Nullable Input<TypedLocalObjectReferenceArgs> dataSourceRef;

    public Input<TypedLocalObjectReferenceArgs> getDataSourceRef() {
        return this.dataSourceRef == null ? Input.empty() : this.dataSourceRef;
    }

    @InputImport(name="resources")
    private final @Nullable Input<ResourceRequirementsArgs> resources;

    public Input<ResourceRequirementsArgs> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    @InputImport(name="selector")
    private final @Nullable Input<LabelSelectorArgs> selector;

    public Input<LabelSelectorArgs> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    @InputImport(name="storageClassName")
    private final @Nullable Input<String> storageClassName;

    public Input<String> getStorageClassName() {
        return this.storageClassName == null ? Input.empty() : this.storageClassName;
    }

    @InputImport(name="volumeMode")
    private final @Nullable Input<String> volumeMode;

    public Input<String> getVolumeMode() {
        return this.volumeMode == null ? Input.empty() : this.volumeMode;
    }

    @InputImport(name="volumeName")
    private final @Nullable Input<String> volumeName;

    public Input<String> getVolumeName() {
        return this.volumeName == null ? Input.empty() : this.volumeName;
    }

    public PersistentVolumeClaimSpecArgs(
        @Nullable Input<List<String>> accessModes,
        @Nullable Input<TypedLocalObjectReferenceArgs> dataSource,
        @Nullable Input<TypedLocalObjectReferenceArgs> dataSourceRef,
        @Nullable Input<ResourceRequirementsArgs> resources,
        @Nullable Input<LabelSelectorArgs> selector,
        @Nullable Input<String> storageClassName,
        @Nullable Input<String> volumeMode,
        @Nullable Input<String> volumeName) {
        this.accessModes = accessModes;
        this.dataSource = dataSource;
        this.dataSourceRef = dataSourceRef;
        this.resources = resources;
        this.selector = selector;
        this.storageClassName = storageClassName;
        this.volumeMode = volumeMode;
        this.volumeName = volumeName;
    }

    private PersistentVolumeClaimSpecArgs() {
        this.accessModes = Input.empty();
        this.dataSource = Input.empty();
        this.dataSourceRef = Input.empty();
        this.resources = Input.empty();
        this.selector = Input.empty();
        this.storageClassName = Input.empty();
        this.volumeMode = Input.empty();
        this.volumeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentVolumeClaimSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> accessModes;
        private @Nullable Input<TypedLocalObjectReferenceArgs> dataSource;
        private @Nullable Input<TypedLocalObjectReferenceArgs> dataSourceRef;
        private @Nullable Input<ResourceRequirementsArgs> resources;
        private @Nullable Input<LabelSelectorArgs> selector;
        private @Nullable Input<String> storageClassName;
        private @Nullable Input<String> volumeMode;
        private @Nullable Input<String> volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistentVolumeClaimSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessModes = defaults.accessModes;
    	      this.dataSource = defaults.dataSource;
    	      this.dataSourceRef = defaults.dataSourceRef;
    	      this.resources = defaults.resources;
    	      this.selector = defaults.selector;
    	      this.storageClassName = defaults.storageClassName;
    	      this.volumeMode = defaults.volumeMode;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder setAccessModes(@Nullable Input<List<String>> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        public Builder setAccessModes(@Nullable List<String> accessModes) {
            this.accessModes = Input.ofNullable(accessModes);
            return this;
        }

        public Builder setDataSource(@Nullable Input<TypedLocalObjectReferenceArgs> dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder setDataSource(@Nullable TypedLocalObjectReferenceArgs dataSource) {
            this.dataSource = Input.ofNullable(dataSource);
            return this;
        }

        public Builder setDataSourceRef(@Nullable Input<TypedLocalObjectReferenceArgs> dataSourceRef) {
            this.dataSourceRef = dataSourceRef;
            return this;
        }

        public Builder setDataSourceRef(@Nullable TypedLocalObjectReferenceArgs dataSourceRef) {
            this.dataSourceRef = Input.ofNullable(dataSourceRef);
            return this;
        }

        public Builder setResources(@Nullable Input<ResourceRequirementsArgs> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setResources(@Nullable ResourceRequirementsArgs resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }

        public Builder setSelector(@Nullable Input<LabelSelectorArgs> selector) {
            this.selector = selector;
            return this;
        }

        public Builder setSelector(@Nullable LabelSelectorArgs selector) {
            this.selector = Input.ofNullable(selector);
            return this;
        }

        public Builder setStorageClassName(@Nullable Input<String> storageClassName) {
            this.storageClassName = storageClassName;
            return this;
        }

        public Builder setStorageClassName(@Nullable String storageClassName) {
            this.storageClassName = Input.ofNullable(storageClassName);
            return this;
        }

        public Builder setVolumeMode(@Nullable Input<String> volumeMode) {
            this.volumeMode = volumeMode;
            return this;
        }

        public Builder setVolumeMode(@Nullable String volumeMode) {
            this.volumeMode = Input.ofNullable(volumeMode);
            return this;
        }

        public Builder setVolumeName(@Nullable Input<String> volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public Builder setVolumeName(@Nullable String volumeName) {
            this.volumeName = Input.ofNullable(volumeName);
            return this;
        }

        public PersistentVolumeClaimSpecArgs build() {
            return new PersistentVolumeClaimSpecArgs(accessModes, dataSource, dataSourceRef, resources, selector, storageClassName, volumeMode, volumeName);
        }
    }
}
