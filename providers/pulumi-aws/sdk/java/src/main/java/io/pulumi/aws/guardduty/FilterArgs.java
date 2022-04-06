// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.aws.guardduty.inputs.FilterFindingCriteriaArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterArgs Empty = new FilterArgs();

    /**
     * Specifies the action that is to be applied to the findings that match the filter. Can be one of `ARCHIVE` or `NOOP`.
     * 
     */
    @Import(name="action", required=true)
      private final Output<String> action;

    public Output<String> getAction() {
        return this.action;
    }

    /**
     * Description of the filter.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * ID of a GuardDuty detector, attached to your account.
     * 
     */
    @Import(name="detectorId", required=true)
      private final Output<String> detectorId;

    public Output<String> getDetectorId() {
        return this.detectorId;
    }

    /**
     * Represents the criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
     * 
     */
    @Import(name="findingCriteria", required=true)
      private final Output<FilterFindingCriteriaArgs> findingCriteria;

    public Output<FilterFindingCriteriaArgs> getFindingCriteria() {
        return this.findingCriteria;
    }

    /**
     * The name of your filter.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
     * 
     */
    @Import(name="rank", required=true)
      private final Output<Integer> rank;

    public Output<Integer> getRank() {
        return this.rank;
    }

    /**
     * The tags that you want to add to the Filter resource. A tag consists of a key and a value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public FilterArgs(
        Output<String> action,
        @Nullable Output<String> description,
        Output<String> detectorId,
        Output<FilterFindingCriteriaArgs> findingCriteria,
        @Nullable Output<String> name,
        Output<Integer> rank,
        @Nullable Output<Map<String,String>> tags) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.description = description;
        this.detectorId = Objects.requireNonNull(detectorId, "expected parameter 'detectorId' to be non-null");
        this.findingCriteria = Objects.requireNonNull(findingCriteria, "expected parameter 'findingCriteria' to be non-null");
        this.name = name;
        this.rank = Objects.requireNonNull(rank, "expected parameter 'rank' to be non-null");
        this.tags = tags;
    }

    private FilterArgs() {
        this.action = Output.empty();
        this.description = Output.empty();
        this.detectorId = Output.empty();
        this.findingCriteria = Output.empty();
        this.name = Output.empty();
        this.rank = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> action;
        private @Nullable Output<String> description;
        private Output<String> detectorId;
        private Output<FilterFindingCriteriaArgs> findingCriteria;
        private @Nullable Output<String> name;
        private Output<Integer> rank;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.detectorId = defaults.detectorId;
    	      this.findingCriteria = defaults.findingCriteria;
    	      this.name = defaults.name;
    	      this.rank = defaults.rank;
    	      this.tags = defaults.tags;
        }

        public Builder action(Output<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(String action) {
            this.action = Output.of(Objects.requireNonNull(action));
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
        public Builder detectorId(Output<String> detectorId) {
            this.detectorId = Objects.requireNonNull(detectorId);
            return this;
        }
        public Builder detectorId(String detectorId) {
            this.detectorId = Output.of(Objects.requireNonNull(detectorId));
            return this;
        }
        public Builder findingCriteria(Output<FilterFindingCriteriaArgs> findingCriteria) {
            this.findingCriteria = Objects.requireNonNull(findingCriteria);
            return this;
        }
        public Builder findingCriteria(FilterFindingCriteriaArgs findingCriteria) {
            this.findingCriteria = Output.of(Objects.requireNonNull(findingCriteria));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder rank(Output<Integer> rank) {
            this.rank = Objects.requireNonNull(rank);
            return this;
        }
        public Builder rank(Integer rank) {
            this.rank = Output.of(Objects.requireNonNull(rank));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public FilterArgs build() {
            return new FilterArgs(action, description, detectorId, findingCriteria, name, rank, tags);
        }
    }
}