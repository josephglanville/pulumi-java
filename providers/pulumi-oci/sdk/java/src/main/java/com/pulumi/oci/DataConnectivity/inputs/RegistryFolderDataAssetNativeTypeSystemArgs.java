// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataConnectivity.inputs.RegistryFolderDataAssetNativeTypeSystemParentRefArgs;
import com.pulumi.oci.DataConnectivity.inputs.RegistryFolderDataAssetNativeTypeSystemTypeArgs;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryFolderDataAssetNativeTypeSystemArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryFolderDataAssetNativeTypeSystemArgs Empty = new RegistryFolderDataAssetNativeTypeSystemArgs();

    /**
     * (Updatable) User-defined description for the folder.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) User-defined description for the folder.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return (Updatable) Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * (Updatable) Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return (Updatable) Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * (Updatable) The type of the folder.
     * 
     */
    @Import(name="modelType")
    private @Nullable Output<String> modelType;

    /**
     * @return (Updatable) The type of the folder.
     * 
     */
    public Optional<Output<String>> modelType() {
        return Optional.ofNullable(this.modelType);
    }

    /**
     * (Updatable) The model version of an object.
     * 
     */
    @Import(name="modelVersion")
    private @Nullable Output<String> modelVersion;

    /**
     * @return (Updatable) The model version of an object.
     * 
     */
    public Optional<Output<String>> modelVersion() {
        return Optional.ofNullable(this.modelVersion);
    }

    /**
     * (Updatable) Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (Updatable) Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Updatable) The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * 
     */
    @Import(name="objectStatus")
    private @Nullable Output<Integer> objectStatus;

    /**
     * @return (Updatable) The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * 
     */
    public Optional<Output<Integer>> objectStatus() {
        return Optional.ofNullable(this.objectStatus);
    }

    /**
     * (Updatable) The version of the object that is used to track changes in the object instance.
     * 
     */
    @Import(name="objectVersion")
    private @Nullable Output<Integer> objectVersion;

    /**
     * @return (Updatable) The version of the object that is used to track changes in the object instance.
     * 
     */
    public Optional<Output<Integer>> objectVersion() {
        return Optional.ofNullable(this.objectVersion);
    }

    /**
     * (Updatable) A reference to the object&#39;s parent.
     * 
     */
    @Import(name="parentRef")
    private @Nullable Output<RegistryFolderDataAssetNativeTypeSystemParentRefArgs> parentRef;

    /**
     * @return (Updatable) A reference to the object&#39;s parent.
     * 
     */
    public Optional<Output<RegistryFolderDataAssetNativeTypeSystemParentRefArgs>> parentRef() {
        return Optional.ofNullable(this.parentRef);
    }

    /**
     * (Updatable) The type system to map from.
     * 
     */
    @Import(name="typeMappingFrom")
    private @Nullable Output<Map<String,Object>> typeMappingFrom;

    /**
     * @return (Updatable) The type system to map from.
     * 
     */
    public Optional<Output<Map<String,Object>>> typeMappingFrom() {
        return Optional.ofNullable(this.typeMappingFrom);
    }

    /**
     * (Updatable) The type system to map to.
     * 
     */
    @Import(name="typeMappingTo")
    private @Nullable Output<Map<String,Object>> typeMappingTo;

    /**
     * @return (Updatable) The type system to map to.
     * 
     */
    public Optional<Output<Map<String,Object>>> typeMappingTo() {
        return Optional.ofNullable(this.typeMappingTo);
    }

    /**
     * (Updatable) An array of types.
     * 
     */
    @Import(name="types")
    private @Nullable Output<List<RegistryFolderDataAssetNativeTypeSystemTypeArgs>> types;

    /**
     * @return (Updatable) An array of types.
     * 
     */
    public Optional<Output<List<RegistryFolderDataAssetNativeTypeSystemTypeArgs>>> types() {
        return Optional.ofNullable(this.types);
    }

    private RegistryFolderDataAssetNativeTypeSystemArgs() {}

    private RegistryFolderDataAssetNativeTypeSystemArgs(RegistryFolderDataAssetNativeTypeSystemArgs $) {
        this.description = $.description;
        this.identifier = $.identifier;
        this.key = $.key;
        this.modelType = $.modelType;
        this.modelVersion = $.modelVersion;
        this.name = $.name;
        this.objectStatus = $.objectStatus;
        this.objectVersion = $.objectVersion;
        this.parentRef = $.parentRef;
        this.typeMappingFrom = $.typeMappingFrom;
        this.typeMappingTo = $.typeMappingTo;
        this.types = $.types;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryFolderDataAssetNativeTypeSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryFolderDataAssetNativeTypeSystemArgs $;

        public Builder() {
            $ = new RegistryFolderDataAssetNativeTypeSystemArgs();
        }

        public Builder(RegistryFolderDataAssetNativeTypeSystemArgs defaults) {
            $ = new RegistryFolderDataAssetNativeTypeSystemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description (Updatable) User-defined description for the folder.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) User-defined description for the folder.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identifier (Updatable) Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier (Updatable) Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param key (Updatable) Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key (Updatable) Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param modelType (Updatable) The type of the folder.
         * 
         * @return builder
         * 
         */
        public Builder modelType(@Nullable Output<String> modelType) {
            $.modelType = modelType;
            return this;
        }

        /**
         * @param modelType (Updatable) The type of the folder.
         * 
         * @return builder
         * 
         */
        public Builder modelType(String modelType) {
            return modelType(Output.of(modelType));
        }

        /**
         * @param modelVersion (Updatable) The model version of an object.
         * 
         * @return builder
         * 
         */
        public Builder modelVersion(@Nullable Output<String> modelVersion) {
            $.modelVersion = modelVersion;
            return this;
        }

        /**
         * @param modelVersion (Updatable) The model version of an object.
         * 
         * @return builder
         * 
         */
        public Builder modelVersion(String modelVersion) {
            return modelVersion(Output.of(modelVersion));
        }

        /**
         * @param name (Updatable) Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Updatable) Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param objectStatus (Updatable) The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         * 
         * @return builder
         * 
         */
        public Builder objectStatus(@Nullable Output<Integer> objectStatus) {
            $.objectStatus = objectStatus;
            return this;
        }

        /**
         * @param objectStatus (Updatable) The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         * 
         * @return builder
         * 
         */
        public Builder objectStatus(Integer objectStatus) {
            return objectStatus(Output.of(objectStatus));
        }

        /**
         * @param objectVersion (Updatable) The version of the object that is used to track changes in the object instance.
         * 
         * @return builder
         * 
         */
        public Builder objectVersion(@Nullable Output<Integer> objectVersion) {
            $.objectVersion = objectVersion;
            return this;
        }

        /**
         * @param objectVersion (Updatable) The version of the object that is used to track changes in the object instance.
         * 
         * @return builder
         * 
         */
        public Builder objectVersion(Integer objectVersion) {
            return objectVersion(Output.of(objectVersion));
        }

        /**
         * @param parentRef (Updatable) A reference to the object&#39;s parent.
         * 
         * @return builder
         * 
         */
        public Builder parentRef(@Nullable Output<RegistryFolderDataAssetNativeTypeSystemParentRefArgs> parentRef) {
            $.parentRef = parentRef;
            return this;
        }

        /**
         * @param parentRef (Updatable) A reference to the object&#39;s parent.
         * 
         * @return builder
         * 
         */
        public Builder parentRef(RegistryFolderDataAssetNativeTypeSystemParentRefArgs parentRef) {
            return parentRef(Output.of(parentRef));
        }

        /**
         * @param typeMappingFrom (Updatable) The type system to map from.
         * 
         * @return builder
         * 
         */
        public Builder typeMappingFrom(@Nullable Output<Map<String,Object>> typeMappingFrom) {
            $.typeMappingFrom = typeMappingFrom;
            return this;
        }

        /**
         * @param typeMappingFrom (Updatable) The type system to map from.
         * 
         * @return builder
         * 
         */
        public Builder typeMappingFrom(Map<String,Object> typeMappingFrom) {
            return typeMappingFrom(Output.of(typeMappingFrom));
        }

        /**
         * @param typeMappingTo (Updatable) The type system to map to.
         * 
         * @return builder
         * 
         */
        public Builder typeMappingTo(@Nullable Output<Map<String,Object>> typeMappingTo) {
            $.typeMappingTo = typeMappingTo;
            return this;
        }

        /**
         * @param typeMappingTo (Updatable) The type system to map to.
         * 
         * @return builder
         * 
         */
        public Builder typeMappingTo(Map<String,Object> typeMappingTo) {
            return typeMappingTo(Output.of(typeMappingTo));
        }

        /**
         * @param types (Updatable) An array of types.
         * 
         * @return builder
         * 
         */
        public Builder types(@Nullable Output<List<RegistryFolderDataAssetNativeTypeSystemTypeArgs>> types) {
            $.types = types;
            return this;
        }

        /**
         * @param types (Updatable) An array of types.
         * 
         * @return builder
         * 
         */
        public Builder types(List<RegistryFolderDataAssetNativeTypeSystemTypeArgs> types) {
            return types(Output.of(types));
        }

        /**
         * @param types (Updatable) An array of types.
         * 
         * @return builder
         * 
         */
        public Builder types(RegistryFolderDataAssetNativeTypeSystemTypeArgs... types) {
            return types(List.of(types));
        }

        public RegistryFolderDataAssetNativeTypeSystemArgs build() {
            return $;
        }
    }

}
