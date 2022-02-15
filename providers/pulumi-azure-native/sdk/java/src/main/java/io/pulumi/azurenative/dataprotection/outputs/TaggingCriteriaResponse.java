// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.azurenative.dataprotection.outputs.RetentionTagResponse;
import io.pulumi.azurenative.dataprotection.outputs.ScheduleBasedBackupCriteriaResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaggingCriteriaResponse {
    private final @Nullable List<ScheduleBasedBackupCriteriaResponse> criteria;
    private final Boolean isDefault;
    private final RetentionTagResponse tagInfo;
    private final Double taggingPriority;

    @OutputCustomType.Constructor({"criteria","isDefault","tagInfo","taggingPriority"})
    private TaggingCriteriaResponse(
        @Nullable List<ScheduleBasedBackupCriteriaResponse> criteria,
        Boolean isDefault,
        RetentionTagResponse tagInfo,
        Double taggingPriority) {
        this.criteria = criteria;
        this.isDefault = Objects.requireNonNull(isDefault);
        this.tagInfo = Objects.requireNonNull(tagInfo);
        this.taggingPriority = Objects.requireNonNull(taggingPriority);
    }

    public List<ScheduleBasedBackupCriteriaResponse> getCriteria() {
        return this.criteria == null ? List.of() : this.criteria;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    public RetentionTagResponse getTagInfo() {
        return this.tagInfo;
    }
    public Double getTaggingPriority() {
        return this.taggingPriority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaggingCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ScheduleBasedBackupCriteriaResponse> criteria;
        private Boolean isDefault;
        private RetentionTagResponse tagInfo;
        private Double taggingPriority;

        public Builder() {
    	      // Empty
        }

        public Builder(TaggingCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
    	      this.isDefault = defaults.isDefault;
    	      this.tagInfo = defaults.tagInfo;
    	      this.taggingPriority = defaults.taggingPriority;
        }

        public Builder setCriteria(@Nullable List<ScheduleBasedBackupCriteriaResponse> criteria) {
            this.criteria = criteria;
            return this;
        }

        public Builder setIsDefault(Boolean isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }

        public Builder setTagInfo(RetentionTagResponse tagInfo) {
            this.tagInfo = Objects.requireNonNull(tagInfo);
            return this;
        }

        public Builder setTaggingPriority(Double taggingPriority) {
            this.taggingPriority = Objects.requireNonNull(taggingPriority);
            return this;
        }

        public TaggingCriteriaResponse build() {
            return new TaggingCriteriaResponse(criteria, isDefault, tagInfo, taggingPriority);
        }
    }
}