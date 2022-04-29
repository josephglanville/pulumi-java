// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataConnectivity.inputs.RegistryFolderDataAssetMetadataAggregatorArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryFolderDataAssetMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryFolderDataAssetMetadataArgs Empty = new RegistryFolderDataAssetMetadataArgs();

    /**
     * (Updatable) A summary type containing information about the object&#39;s aggregator including its type, key, name and description.
     * 
     */
    @Import(name="aggregator")
    private @Nullable Output<RegistryFolderDataAssetMetadataAggregatorArgs> aggregator;

    /**
     * @return (Updatable) A summary type containing information about the object&#39;s aggregator including its type, key, name and description.
     * 
     */
    public Optional<Output<RegistryFolderDataAssetMetadataAggregatorArgs>> aggregator() {
        return Optional.ofNullable(this.aggregator);
    }

    /**
     * (Updatable) The owning object&#39;s key for this object.
     * 
     */
    @Import(name="aggregatorKey")
    private @Nullable Output<String> aggregatorKey;

    /**
     * @return (Updatable) The owning object&#39;s key for this object.
     * 
     */
    public Optional<Output<String>> aggregatorKey() {
        return Optional.ofNullable(this.aggregatorKey);
    }

    /**
     * (Updatable) The user that created the object.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return (Updatable) The user that created the object.
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * (Updatable) The user that created the object.
     * 
     */
    @Import(name="createdByName")
    private @Nullable Output<String> createdByName;

    /**
     * @return (Updatable) The user that created the object.
     * 
     */
    public Optional<Output<String>> createdByName() {
        return Optional.ofNullable(this.createdByName);
    }

    /**
     * (Updatable) The full path to identify this object.
     * 
     */
    @Import(name="identifierPath")
    private @Nullable Output<String> identifierPath;

    /**
     * @return (Updatable) The full path to identify this object.
     * 
     */
    public Optional<Output<String>> identifierPath() {
        return Optional.ofNullable(this.identifierPath);
    }

    /**
     * (Updatable) Information property fields.
     * 
     */
    @Import(name="infoFields")
    private @Nullable Output<Map<String,Object>> infoFields;

    /**
     * @return (Updatable) Information property fields.
     * 
     */
    public Optional<Output<Map<String,Object>>> infoFields() {
        return Optional.ofNullable(this.infoFields);
    }

    /**
     * (Updatable) Specifies whether this object is a favorite or not.
     * 
     */
    @Import(name="isFavorite")
    private @Nullable Output<Boolean> isFavorite;

    /**
     * @return (Updatable) Specifies whether this object is a favorite or not.
     * 
     */
    public Optional<Output<Boolean>> isFavorite() {
        return Optional.ofNullable(this.isFavorite);
    }

    /**
     * (Updatable) Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<String>> labels;

    /**
     * @return (Updatable) Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
     * 
     */
    public Optional<Output<List<String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * (Updatable) The registry version.
     * 
     */
    @Import(name="registryVersion")
    private @Nullable Output<Integer> registryVersion;

    /**
     * @return (Updatable) The registry version.
     * 
     */
    public Optional<Output<Integer>> registryVersion() {
        return Optional.ofNullable(this.registryVersion);
    }

    /**
     * (Updatable) The date and time that the object was created.
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return (Updatable) The date and time that the object was created.
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * (Updatable) The date and time that the object was updated.
     * 
     */
    @Import(name="timeUpdated")
    private @Nullable Output<String> timeUpdated;

    /**
     * @return (Updatable) The date and time that the object was updated.
     * 
     */
    public Optional<Output<String>> timeUpdated() {
        return Optional.ofNullable(this.timeUpdated);
    }

    /**
     * (Updatable) The user that updated the object.
     * 
     */
    @Import(name="updatedBy")
    private @Nullable Output<String> updatedBy;

    /**
     * @return (Updatable) The user that updated the object.
     * 
     */
    public Optional<Output<String>> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }

    /**
     * (Updatable) The user that updated the object.
     * 
     */
    @Import(name="updatedByName")
    private @Nullable Output<String> updatedByName;

    /**
     * @return (Updatable) The user that updated the object.
     * 
     */
    public Optional<Output<String>> updatedByName() {
        return Optional.ofNullable(this.updatedByName);
    }

    private RegistryFolderDataAssetMetadataArgs() {}

    private RegistryFolderDataAssetMetadataArgs(RegistryFolderDataAssetMetadataArgs $) {
        this.aggregator = $.aggregator;
        this.aggregatorKey = $.aggregatorKey;
        this.createdBy = $.createdBy;
        this.createdByName = $.createdByName;
        this.identifierPath = $.identifierPath;
        this.infoFields = $.infoFields;
        this.isFavorite = $.isFavorite;
        this.labels = $.labels;
        this.registryVersion = $.registryVersion;
        this.timeCreated = $.timeCreated;
        this.timeUpdated = $.timeUpdated;
        this.updatedBy = $.updatedBy;
        this.updatedByName = $.updatedByName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryFolderDataAssetMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryFolderDataAssetMetadataArgs $;

        public Builder() {
            $ = new RegistryFolderDataAssetMetadataArgs();
        }

        public Builder(RegistryFolderDataAssetMetadataArgs defaults) {
            $ = new RegistryFolderDataAssetMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregator (Updatable) A summary type containing information about the object&#39;s aggregator including its type, key, name and description.
         * 
         * @return builder
         * 
         */
        public Builder aggregator(@Nullable Output<RegistryFolderDataAssetMetadataAggregatorArgs> aggregator) {
            $.aggregator = aggregator;
            return this;
        }

        /**
         * @param aggregator (Updatable) A summary type containing information about the object&#39;s aggregator including its type, key, name and description.
         * 
         * @return builder
         * 
         */
        public Builder aggregator(RegistryFolderDataAssetMetadataAggregatorArgs aggregator) {
            return aggregator(Output.of(aggregator));
        }

        /**
         * @param aggregatorKey (Updatable) The owning object&#39;s key for this object.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorKey(@Nullable Output<String> aggregatorKey) {
            $.aggregatorKey = aggregatorKey;
            return this;
        }

        /**
         * @param aggregatorKey (Updatable) The owning object&#39;s key for this object.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorKey(String aggregatorKey) {
            return aggregatorKey(Output.of(aggregatorKey));
        }

        /**
         * @param createdBy (Updatable) The user that created the object.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy (Updatable) The user that created the object.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param createdByName (Updatable) The user that created the object.
         * 
         * @return builder
         * 
         */
        public Builder createdByName(@Nullable Output<String> createdByName) {
            $.createdByName = createdByName;
            return this;
        }

        /**
         * @param createdByName (Updatable) The user that created the object.
         * 
         * @return builder
         * 
         */
        public Builder createdByName(String createdByName) {
            return createdByName(Output.of(createdByName));
        }

        /**
         * @param identifierPath (Updatable) The full path to identify this object.
         * 
         * @return builder
         * 
         */
        public Builder identifierPath(@Nullable Output<String> identifierPath) {
            $.identifierPath = identifierPath;
            return this;
        }

        /**
         * @param identifierPath (Updatable) The full path to identify this object.
         * 
         * @return builder
         * 
         */
        public Builder identifierPath(String identifierPath) {
            return identifierPath(Output.of(identifierPath));
        }

        /**
         * @param infoFields (Updatable) Information property fields.
         * 
         * @return builder
         * 
         */
        public Builder infoFields(@Nullable Output<Map<String,Object>> infoFields) {
            $.infoFields = infoFields;
            return this;
        }

        /**
         * @param infoFields (Updatable) Information property fields.
         * 
         * @return builder
         * 
         */
        public Builder infoFields(Map<String,Object> infoFields) {
            return infoFields(Output.of(infoFields));
        }

        /**
         * @param isFavorite (Updatable) Specifies whether this object is a favorite or not.
         * 
         * @return builder
         * 
         */
        public Builder isFavorite(@Nullable Output<Boolean> isFavorite) {
            $.isFavorite = isFavorite;
            return this;
        }

        /**
         * @param isFavorite (Updatable) Specifies whether this object is a favorite or not.
         * 
         * @return builder
         * 
         */
        public Builder isFavorite(Boolean isFavorite) {
            return isFavorite(Output.of(isFavorite));
        }

        /**
         * @param labels (Updatable) Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels (Updatable) Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels (Updatable) Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
         * 
         * @return builder
         * 
         */
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param registryVersion (Updatable) The registry version.
         * 
         * @return builder
         * 
         */
        public Builder registryVersion(@Nullable Output<Integer> registryVersion) {
            $.registryVersion = registryVersion;
            return this;
        }

        /**
         * @param registryVersion (Updatable) The registry version.
         * 
         * @return builder
         * 
         */
        public Builder registryVersion(Integer registryVersion) {
            return registryVersion(Output.of(registryVersion));
        }

        /**
         * @param timeCreated (Updatable) The date and time that the object was created.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated (Updatable) The date and time that the object was created.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param timeUpdated (Updatable) The date and time that the object was updated.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(@Nullable Output<String> timeUpdated) {
            $.timeUpdated = timeUpdated;
            return this;
        }

        /**
         * @param timeUpdated (Updatable) The date and time that the object was updated.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(String timeUpdated) {
            return timeUpdated(Output.of(timeUpdated));
        }

        /**
         * @param updatedBy (Updatable) The user that updated the object.
         * 
         * @return builder
         * 
         */
        public Builder updatedBy(@Nullable Output<String> updatedBy) {
            $.updatedBy = updatedBy;
            return this;
        }

        /**
         * @param updatedBy (Updatable) The user that updated the object.
         * 
         * @return builder
         * 
         */
        public Builder updatedBy(String updatedBy) {
            return updatedBy(Output.of(updatedBy));
        }

        /**
         * @param updatedByName (Updatable) The user that updated the object.
         * 
         * @return builder
         * 
         */
        public Builder updatedByName(@Nullable Output<String> updatedByName) {
            $.updatedByName = updatedByName;
            return this;
        }

        /**
         * @param updatedByName (Updatable) The user that updated the object.
         * 
         * @return builder
         * 
         */
        public Builder updatedByName(String updatedByName) {
            return updatedByName(Output.of(updatedByName));
        }

        public RegistryFolderDataAssetMetadataArgs build() {
            return $;
        }
    }

}
