// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataConnectivity.outputs.RegistryFolderDataAssetNativeTypeSystemTypeConfigDefinition;
import com.pulumi.oci.DataConnectivity.outputs.RegistryFolderDataAssetNativeTypeSystemTypeParentRef;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegistryFolderDataAssetNativeTypeSystemType {
    /**
     * @return (Updatable) The configuration details of a configurable object. This contains one or more config param definitions.
     * 
     */
    private final @Nullable RegistryFolderDataAssetNativeTypeSystemTypeConfigDefinition configDefinition;
    /**
     * @return (Updatable) User-defined description for the folder.
     * 
     */
    private final @Nullable String description;
    /**
     * @return (Updatable) The data type.
     * 
     */
    private final @Nullable String dtType;
    /**
     * @return (Updatable) Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
     * 
     */
    private final @Nullable String key;
    /**
     * @return (Updatable) The type of the folder.
     * 
     */
    private final String modelType;
    /**
     * @return (Updatable) The model version of an object.
     * 
     */
    private final @Nullable String modelVersion;
    /**
     * @return (Updatable) Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * 
     */
    private final @Nullable String name;
    /**
     * @return (Updatable) The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * 
     */
    private final @Nullable Integer objectStatus;
    /**
     * @return (Updatable) A reference to the object&#39;s parent.
     * 
     */
    private final @Nullable RegistryFolderDataAssetNativeTypeSystemTypeParentRef parentRef;
    /**
     * @return (Updatable) The data type system name.
     * 
     */
    private final @Nullable String typeSystemName;

    @CustomType.Constructor
    private RegistryFolderDataAssetNativeTypeSystemType(
        @CustomType.Parameter("configDefinition") @Nullable RegistryFolderDataAssetNativeTypeSystemTypeConfigDefinition configDefinition,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("dtType") @Nullable String dtType,
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("modelType") String modelType,
        @CustomType.Parameter("modelVersion") @Nullable String modelVersion,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("objectStatus") @Nullable Integer objectStatus,
        @CustomType.Parameter("parentRef") @Nullable RegistryFolderDataAssetNativeTypeSystemTypeParentRef parentRef,
        @CustomType.Parameter("typeSystemName") @Nullable String typeSystemName) {
        this.configDefinition = configDefinition;
        this.description = description;
        this.dtType = dtType;
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.name = name;
        this.objectStatus = objectStatus;
        this.parentRef = parentRef;
        this.typeSystemName = typeSystemName;
    }

    /**
     * @return (Updatable) The configuration details of a configurable object. This contains one or more config param definitions.
     * 
     */
    public Optional<RegistryFolderDataAssetNativeTypeSystemTypeConfigDefinition> configDefinition() {
        return Optional.ofNullable(this.configDefinition);
    }
    /**
     * @return (Updatable) User-defined description for the folder.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return (Updatable) The data type.
     * 
     */
    public Optional<String> dtType() {
        return Optional.ofNullable(this.dtType);
    }
    /**
     * @return (Updatable) Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return (Updatable) The type of the folder.
     * 
     */
    public String modelType() {
        return this.modelType;
    }
    /**
     * @return (Updatable) The model version of an object.
     * 
     */
    public Optional<String> modelVersion() {
        return Optional.ofNullable(this.modelVersion);
    }
    /**
     * @return (Updatable) Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return (Updatable) The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * 
     */
    public Optional<Integer> objectStatus() {
        return Optional.ofNullable(this.objectStatus);
    }
    /**
     * @return (Updatable) A reference to the object&#39;s parent.
     * 
     */
    public Optional<RegistryFolderDataAssetNativeTypeSystemTypeParentRef> parentRef() {
        return Optional.ofNullable(this.parentRef);
    }
    /**
     * @return (Updatable) The data type system name.
     * 
     */
    public Optional<String> typeSystemName() {
        return Optional.ofNullable(this.typeSystemName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryFolderDataAssetNativeTypeSystemType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RegistryFolderDataAssetNativeTypeSystemTypeConfigDefinition configDefinition;
        private @Nullable String description;
        private @Nullable String dtType;
        private @Nullable String key;
        private String modelType;
        private @Nullable String modelVersion;
        private @Nullable String name;
        private @Nullable Integer objectStatus;
        private @Nullable RegistryFolderDataAssetNativeTypeSystemTypeParentRef parentRef;
        private @Nullable String typeSystemName;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryFolderDataAssetNativeTypeSystemType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configDefinition = defaults.configDefinition;
    	      this.description = defaults.description;
    	      this.dtType = defaults.dtType;
    	      this.key = defaults.key;
    	      this.modelType = defaults.modelType;
    	      this.modelVersion = defaults.modelVersion;
    	      this.name = defaults.name;
    	      this.objectStatus = defaults.objectStatus;
    	      this.parentRef = defaults.parentRef;
    	      this.typeSystemName = defaults.typeSystemName;
        }

        public Builder configDefinition(@Nullable RegistryFolderDataAssetNativeTypeSystemTypeConfigDefinition configDefinition) {
            this.configDefinition = configDefinition;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder dtType(@Nullable String dtType) {
            this.dtType = dtType;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder modelType(String modelType) {
            this.modelType = Objects.requireNonNull(modelType);
            return this;
        }
        public Builder modelVersion(@Nullable String modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder objectStatus(@Nullable Integer objectStatus) {
            this.objectStatus = objectStatus;
            return this;
        }
        public Builder parentRef(@Nullable RegistryFolderDataAssetNativeTypeSystemTypeParentRef parentRef) {
            this.parentRef = parentRef;
            return this;
        }
        public Builder typeSystemName(@Nullable String typeSystemName) {
            this.typeSystemName = typeSystemName;
            return this;
        }        public RegistryFolderDataAssetNativeTypeSystemType build() {
            return new RegistryFolderDataAssetNativeTypeSystemType(configDefinition, description, dtType, key, modelType, modelVersion, name, objectStatus, parentRef, typeSystemName);
        }
    }
}
