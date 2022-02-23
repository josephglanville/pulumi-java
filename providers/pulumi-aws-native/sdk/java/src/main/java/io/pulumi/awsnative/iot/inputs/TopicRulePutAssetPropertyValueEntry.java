// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.TopicRuleAssetPropertyValue;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRulePutAssetPropertyValueEntry extends io.pulumi.resources.InvokeArgs {

    public static final TopicRulePutAssetPropertyValueEntry Empty = new TopicRulePutAssetPropertyValueEntry();

    @InputImport(name="assetId")
      private final @Nullable String assetId;

    public Optional<String> getAssetId() {
        return this.assetId == null ? Optional.empty() : Optional.ofNullable(this.assetId);
    }

    @InputImport(name="entryId")
      private final @Nullable String entryId;

    public Optional<String> getEntryId() {
        return this.entryId == null ? Optional.empty() : Optional.ofNullable(this.entryId);
    }

    @InputImport(name="propertyAlias")
      private final @Nullable String propertyAlias;

    public Optional<String> getPropertyAlias() {
        return this.propertyAlias == null ? Optional.empty() : Optional.ofNullable(this.propertyAlias);
    }

    @InputImport(name="propertyId")
      private final @Nullable String propertyId;

    public Optional<String> getPropertyId() {
        return this.propertyId == null ? Optional.empty() : Optional.ofNullable(this.propertyId);
    }

    @InputImport(name="propertyValues", required=true)
      private final List<TopicRuleAssetPropertyValue> propertyValues;

    public List<TopicRuleAssetPropertyValue> getPropertyValues() {
        return this.propertyValues;
    }

    public TopicRulePutAssetPropertyValueEntry(
        @Nullable String assetId,
        @Nullable String entryId,
        @Nullable String propertyAlias,
        @Nullable String propertyId,
        List<TopicRuleAssetPropertyValue> propertyValues) {
        this.assetId = assetId;
        this.entryId = entryId;
        this.propertyAlias = propertyAlias;
        this.propertyId = propertyId;
        this.propertyValues = Objects.requireNonNull(propertyValues, "expected parameter 'propertyValues' to be non-null");
    }

    private TopicRulePutAssetPropertyValueEntry() {
        this.assetId = null;
        this.entryId = null;
        this.propertyAlias = null;
        this.propertyId = null;
        this.propertyValues = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRulePutAssetPropertyValueEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assetId;
        private @Nullable String entryId;
        private @Nullable String propertyAlias;
        private @Nullable String propertyId;
        private List<TopicRuleAssetPropertyValue> propertyValues;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRulePutAssetPropertyValueEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.entryId = defaults.entryId;
    	      this.propertyAlias = defaults.propertyAlias;
    	      this.propertyId = defaults.propertyId;
    	      this.propertyValues = defaults.propertyValues;
        }

        public Builder setAssetId(@Nullable String assetId) {
            this.assetId = assetId;
            return this;
        }

        public Builder setEntryId(@Nullable String entryId) {
            this.entryId = entryId;
            return this;
        }

        public Builder setPropertyAlias(@Nullable String propertyAlias) {
            this.propertyAlias = propertyAlias;
            return this;
        }

        public Builder setPropertyId(@Nullable String propertyId) {
            this.propertyId = propertyId;
            return this;
        }

        public Builder setPropertyValues(List<TopicRuleAssetPropertyValue> propertyValues) {
            this.propertyValues = Objects.requireNonNull(propertyValues);
            return this;
        }
        public TopicRulePutAssetPropertyValueEntry build() {
            return new TopicRulePutAssetPropertyValueEntry(assetId, entryId, propertyAlias, propertyId, propertyValues);
        }
    }
}
