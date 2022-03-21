// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetLocalGatewayFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetLocalGatewayResult {
    private final @Nullable List<GetLocalGatewayFilter> filters;
    private final String id;
    /**
     * Amazon Resource Name (ARN) of Outpost
     * 
     */
    private final String outpostArn;
    /**
     * AWS account identifier that owns the Local Gateway.
     * 
     */
    private final String ownerId;
    /**
     * State of the local gateway.
     * 
     */
    private final String state;
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetLocalGatewayResult(
        @CustomType.Parameter("filters") @Nullable List<GetLocalGatewayFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("outpostArn") String outpostArn,
        @CustomType.Parameter("ownerId") String ownerId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.outpostArn = outpostArn;
        this.ownerId = ownerId;
        this.state = state;
        this.tags = tags;
    }

    public List<GetLocalGatewayFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String getId() {
        return this.id;
    }
    /**
     * Amazon Resource Name (ARN) of Outpost
     * 
    */
    public String getOutpostArn() {
        return this.outpostArn;
    }
    /**
     * AWS account identifier that owns the Local Gateway.
     * 
    */
    public String getOwnerId() {
        return this.ownerId;
    }
    /**
     * State of the local gateway.
     * 
    */
    public String getState() {
        return this.state;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetLocalGatewayFilter> filters;
        private String id;
        private String outpostArn;
        private String ownerId;
        private String state;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.outpostArn = defaults.outpostArn;
    	      this.ownerId = defaults.ownerId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetLocalGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetLocalGatewayFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder outpostArn(String outpostArn) {
            this.outpostArn = Objects.requireNonNull(outpostArn);
            return this;
        }
        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetLocalGatewayResult build() {
            return new GetLocalGatewayResult(filters, id, outpostArn, ownerId, state, tags);
        }
    }
}
