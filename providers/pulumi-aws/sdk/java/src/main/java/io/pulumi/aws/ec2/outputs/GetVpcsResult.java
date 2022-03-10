// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetVpcsFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVpcsResult {
    private final @Nullable List<GetVpcsFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A list of all the VPC Ids found. This data source will fail if none are found.
     * 
     */
    private final List<String> ids;
    private final Map<String,String> tags;

    @OutputCustomType.Constructor
    private GetVpcsResult(
        @OutputCustomType.Parameter("filters") @Nullable List<GetVpcsFilter> filters,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("ids") List<String> ids,
        @OutputCustomType.Parameter("tags") Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.tags = tags;
    }

    public List<GetVpcsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * A list of all the VPC Ids found. This data source will fail if none are found.
     * 
    */
    public List<String> getIds() {
        return this.ids;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetVpcsFilter> filters;
        private String id;
        private List<String> ids;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.tags = defaults.tags;
        }

        public Builder setFilters(@Nullable List<GetVpcsFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIds(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetVpcsResult build() {
            return new GetVpcsResult(filters, id, ids, tags);
        }
    }
}
