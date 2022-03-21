// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.outputs;

import io.pulumi.awsnative.frauddetector.outputs.LabelTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLabelResult {
    /**
     * The label ARN.
     * 
     */
    private final @Nullable String arn;
    /**
     * The timestamp when the label was created.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * The label description.
     * 
     */
    private final @Nullable String description;
    /**
     * The timestamp when the label was last updated.
     * 
     */
    private final @Nullable String lastUpdatedTime;
    /**
     * Tags associated with this label.
     * 
     */
    private final @Nullable List<LabelTag> tags;

    @CustomType.Constructor
    private GetLabelResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("createdTime") @Nullable String createdTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("lastUpdatedTime") @Nullable String lastUpdatedTime,
        @CustomType.Parameter("tags") @Nullable List<LabelTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.lastUpdatedTime = lastUpdatedTime;
        this.tags = tags;
    }

    /**
     * The label ARN.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The timestamp when the label was created.
     * 
    */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * The label description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The timestamp when the label was last updated.
     * 
    */
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    /**
     * Tags associated with this label.
     * 
    */
    public List<LabelTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLabelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable String lastUpdatedTime;
        private @Nullable List<LabelTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLabelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Builder tags(@Nullable List<LabelTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(LabelTag... tags) {
            return tags(List.of(tags));
        }        public GetLabelResult build() {
            return new GetLabelResult(arn, createdTime, description, lastUpdatedTime, tags);
        }
    }
}
