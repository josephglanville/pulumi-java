// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataScience.outputs.GetJobShapesFilter;
import com.pulumi.oci.DataScience.outputs.GetJobShapesJobShape;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetJobShapesResult {
    private final String compartmentId;
    private final @Nullable List<GetJobShapesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The list of job_shapes.
     * 
     */
    private final List<GetJobShapesJobShape> jobShapes;

    @CustomType.Constructor
    private GetJobShapesResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("filters") @Nullable List<GetJobShapesFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("jobShapes") List<GetJobShapesJobShape> jobShapes) {
        this.compartmentId = compartmentId;
        this.filters = filters;
        this.id = id;
        this.jobShapes = jobShapes;
    }

    public String compartmentId() {
        return this.compartmentId;
    }
    public List<GetJobShapesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of job_shapes.
     * 
     */
    public List<GetJobShapesJobShape> jobShapes() {
        return this.jobShapes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobShapesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private @Nullable List<GetJobShapesFilter> filters;
        private String id;
        private List<GetJobShapesJobShape> jobShapes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobShapesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.jobShapes = defaults.jobShapes;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder filters(@Nullable List<GetJobShapesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetJobShapesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder jobShapes(List<GetJobShapesJobShape> jobShapes) {
            this.jobShapes = Objects.requireNonNull(jobShapes);
            return this;
        }
        public Builder jobShapes(GetJobShapesJobShape... jobShapes) {
            return jobShapes(List.of(jobShapes));
        }        public GetJobShapesResult build() {
            return new GetJobShapesResult(compartmentId, filters, id, jobShapes);
        }
    }
}
