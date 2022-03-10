// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.outputs;

import io.pulumi.aws.ec2transitgateway.outputs.GetRouteTableFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRouteTableResult {
    /**
     * EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
     * 
     */
    private final String arn;
    /**
     * Boolean whether this is the default association route table for the EC2 Transit Gateway
     * 
     */
    private final Boolean defaultAssociationRouteTable;
    /**
     * Boolean whether this is the default propagation route table for the EC2 Transit Gateway
     * 
     */
    private final Boolean defaultPropagationRouteTable;
    private final @Nullable List<GetRouteTableFilter> filters;
    /**
     * EC2 Transit Gateway Route Table identifier
     * 
     */
    private final String id;
    /**
     * Key-value tags for the EC2 Transit Gateway Route Table
     * 
     */
    private final Map<String,String> tags;
    /**
     * EC2 Transit Gateway identifier
     * 
     */
    private final String transitGatewayId;

    @OutputCustomType.Constructor
    private GetRouteTableResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("defaultAssociationRouteTable") Boolean defaultAssociationRouteTable,
        @OutputCustomType.Parameter("defaultPropagationRouteTable") Boolean defaultPropagationRouteTable,
        @OutputCustomType.Parameter("filters") @Nullable List<GetRouteTableFilter> filters,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("tags") Map<String,String> tags,
        @OutputCustomType.Parameter("transitGatewayId") String transitGatewayId) {
        this.arn = arn;
        this.defaultAssociationRouteTable = defaultAssociationRouteTable;
        this.defaultPropagationRouteTable = defaultPropagationRouteTable;
        this.filters = filters;
        this.id = id;
        this.tags = tags;
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Boolean whether this is the default association route table for the EC2 Transit Gateway
     * 
    */
    public Boolean getDefaultAssociationRouteTable() {
        return this.defaultAssociationRouteTable;
    }
    /**
     * Boolean whether this is the default propagation route table for the EC2 Transit Gateway
     * 
    */
    public Boolean getDefaultPropagationRouteTable() {
        return this.defaultPropagationRouteTable;
    }
    public List<GetRouteTableFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * EC2 Transit Gateway Route Table identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Key-value tags for the EC2 Transit Gateway Route Table
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * EC2 Transit Gateway identifier
     * 
    */
    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Boolean defaultAssociationRouteTable;
        private Boolean defaultPropagationRouteTable;
        private @Nullable List<GetRouteTableFilter> filters;
        private String id;
        private Map<String,String> tags;
        private String transitGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.defaultAssociationRouteTable = defaults.defaultAssociationRouteTable;
    	      this.defaultPropagationRouteTable = defaults.defaultPropagationRouteTable;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setDefaultAssociationRouteTable(Boolean defaultAssociationRouteTable) {
            this.defaultAssociationRouteTable = Objects.requireNonNull(defaultAssociationRouteTable);
            return this;
        }

        public Builder setDefaultPropagationRouteTable(Boolean defaultPropagationRouteTable) {
            this.defaultPropagationRouteTable = Objects.requireNonNull(defaultPropagationRouteTable);
            return this;
        }

        public Builder setFilters(@Nullable List<GetRouteTableFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTransitGatewayId(String transitGatewayId) {
            this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
            return this;
        }
        public GetRouteTableResult build() {
            return new GetRouteTableResult(arn, defaultAssociationRouteTable, defaultPropagationRouteTable, filters, id, tags, transitGatewayId);
        }
    }
}
