// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetInstancesFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetInstancesResult {
    private final @Nullable List<GetInstancesFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * IDs of instances found through the filter
     * 
     */
    private final List<String> ids;
    private final @Nullable List<String> instanceStateNames;
    private final Map<String,String> instanceTags;
    /**
     * Private IP addresses of instances found through the filter
     * 
     */
    private final List<String> privateIps;
    /**
     * Public IP addresses of instances found through the filter
     * 
     */
    private final List<String> publicIps;

    @CustomType.Constructor
    private GetInstancesResult(
        @CustomType.Parameter("filters") @Nullable List<GetInstancesFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instanceStateNames") @Nullable List<String> instanceStateNames,
        @CustomType.Parameter("instanceTags") Map<String,String> instanceTags,
        @CustomType.Parameter("privateIps") List<String> privateIps,
        @CustomType.Parameter("publicIps") List<String> publicIps) {
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.instanceStateNames = instanceStateNames;
        this.instanceTags = instanceTags;
        this.privateIps = privateIps;
        this.publicIps = publicIps;
    }

    public List<GetInstancesFilter> getFilters() {
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
     * IDs of instances found through the filter
     * 
    */
    public List<String> getIds() {
        return this.ids;
    }
    public List<String> getInstanceStateNames() {
        return this.instanceStateNames == null ? List.of() : this.instanceStateNames;
    }
    public Map<String,String> getInstanceTags() {
        return this.instanceTags;
    }
    /**
     * Private IP addresses of instances found through the filter
     * 
    */
    public List<String> getPrivateIps() {
        return this.privateIps;
    }
    /**
     * Public IP addresses of instances found through the filter
     * 
    */
    public List<String> getPublicIps() {
        return this.publicIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetInstancesFilter> filters;
        private String id;
        private List<String> ids;
        private @Nullable List<String> instanceStateNames;
        private Map<String,String> instanceTags;
        private List<String> privateIps;
        private List<String> publicIps;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceStateNames = defaults.instanceStateNames;
    	      this.instanceTags = defaults.instanceTags;
    	      this.privateIps = defaults.privateIps;
    	      this.publicIps = defaults.publicIps;
        }

        public Builder filters(@Nullable List<GetInstancesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetInstancesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder instanceStateNames(@Nullable List<String> instanceStateNames) {
            this.instanceStateNames = instanceStateNames;
            return this;
        }
        public Builder instanceStateNames(String... instanceStateNames) {
            return instanceStateNames(List.of(instanceStateNames));
        }
        public Builder instanceTags(Map<String,String> instanceTags) {
            this.instanceTags = Objects.requireNonNull(instanceTags);
            return this;
        }
        public Builder privateIps(List<String> privateIps) {
            this.privateIps = Objects.requireNonNull(privateIps);
            return this;
        }
        public Builder privateIps(String... privateIps) {
            return privateIps(List.of(privateIps));
        }
        public Builder publicIps(List<String> publicIps) {
            this.publicIps = Objects.requireNonNull(publicIps);
            return this;
        }
        public Builder publicIps(String... publicIps) {
            return publicIps(List.of(publicIps));
        }        public GetInstancesResult build() {
            return new GetInstancesResult(filters, id, ids, instanceStateNames, instanceTags, privateIps, publicIps);
        }
    }
}
