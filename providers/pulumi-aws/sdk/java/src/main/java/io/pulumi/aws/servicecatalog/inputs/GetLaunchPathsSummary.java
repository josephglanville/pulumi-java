// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.aws.servicecatalog.inputs.GetLaunchPathsSummaryConstraintSummary;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GetLaunchPathsSummary extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchPathsSummary Empty = new GetLaunchPathsSummary();

    /**
     * Block for constraints on the portfolio-product relationship. See details below.
     * 
     */
    @Import(name="constraintSummaries", required=true)
      private final List<GetLaunchPathsSummaryConstraintSummary> constraintSummaries;

    public List<GetLaunchPathsSummaryConstraintSummary> getConstraintSummaries() {
        return this.constraintSummaries;
    }

    /**
     * Name of the portfolio to which the path was assigned.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Identifier of the product path.
     * 
     */
    @Import(name="pathId", required=true)
      private final String pathId;

    public String getPathId() {
        return this.pathId;
    }

    /**
     * Tags associated with this product path.
     * 
     */
    @Import(name="tags", required=true)
      private final Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags;
    }

    public GetLaunchPathsSummary(
        List<GetLaunchPathsSummaryConstraintSummary> constraintSummaries,
        String name,
        String pathId,
        Map<String,String> tags) {
        this.constraintSummaries = Objects.requireNonNull(constraintSummaries, "expected parameter 'constraintSummaries' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.pathId = Objects.requireNonNull(pathId, "expected parameter 'pathId' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
    }

    private GetLaunchPathsSummary() {
        this.constraintSummaries = List.of();
        this.name = null;
        this.pathId = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchPathsSummary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetLaunchPathsSummaryConstraintSummary> constraintSummaries;
        private String name;
        private String pathId;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchPathsSummary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraintSummaries = defaults.constraintSummaries;
    	      this.name = defaults.name;
    	      this.pathId = defaults.pathId;
    	      this.tags = defaults.tags;
        }

        public Builder constraintSummaries(List<GetLaunchPathsSummaryConstraintSummary> constraintSummaries) {
            this.constraintSummaries = Objects.requireNonNull(constraintSummaries);
            return this;
        }
        public Builder constraintSummaries(GetLaunchPathsSummaryConstraintSummary... constraintSummaries) {
            return constraintSummaries(List.of(constraintSummaries));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder pathId(String pathId) {
            this.pathId = Objects.requireNonNull(pathId);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetLaunchPathsSummary build() {
            return new GetLaunchPathsSummary(constraintSummaries, name, pathId, tags);
        }
    }
}
