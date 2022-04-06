// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.RouteTableRouteGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteTableState extends io.pulumi.resources.ResourceArgs {

    public static final RouteTableState Empty = new RouteTableState();

    /**
     * The ARN of the route table.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The ID of the AWS account that owns the route table.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Output.empty() : this.ownerId;
    }

    /**
     * A list of virtual gateways for propagation.
     * 
     */
    @Import(name="propagatingVgws")
      private final @Nullable Output<List<String>> propagatingVgws;

    public Output<List<String>> getPropagatingVgws() {
        return this.propagatingVgws == null ? Output.empty() : this.propagatingVgws;
    }

    /**
     * A list of route objects. Their keys are documented below.
     * 
     */
    @Import(name="routes")
      private final @Nullable Output<List<RouteTableRouteGetArgs>> routes;

    public Output<List<RouteTableRouteGetArgs>> getRoutes() {
        return this.routes == null ? Output.empty() : this.routes;
    }

    /**
     * A map of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * The VPC ID.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Output.empty() : this.vpcId;
    }

    public RouteTableState(
        @Nullable Output<String> arn,
        @Nullable Output<String> ownerId,
        @Nullable Output<List<String>> propagatingVgws,
        @Nullable Output<List<RouteTableRouteGetArgs>> routes,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> vpcId) {
        this.arn = arn;
        this.ownerId = ownerId;
        this.propagatingVgws = propagatingVgws;
        this.routes = routes;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcId = vpcId;
    }

    private RouteTableState() {
        this.arn = Output.empty();
        this.ownerId = Output.empty();
        this.propagatingVgws = Output.empty();
        this.routes = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<List<String>> propagatingVgws;
        private @Nullable Output<List<RouteTableRouteGetArgs>> routes;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteTableState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ownerId = defaults.ownerId;
    	      this.propagatingVgws = defaults.propagatingVgws;
    	      this.routes = defaults.routes;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Output.ofNullable(ownerId);
            return this;
        }
        public Builder propagatingVgws(@Nullable Output<List<String>> propagatingVgws) {
            this.propagatingVgws = propagatingVgws;
            return this;
        }
        public Builder propagatingVgws(@Nullable List<String> propagatingVgws) {
            this.propagatingVgws = Output.ofNullable(propagatingVgws);
            return this;
        }
        public Builder propagatingVgws(String... propagatingVgws) {
            return propagatingVgws(List.of(propagatingVgws));
        }
        public Builder routes(@Nullable Output<List<RouteTableRouteGetArgs>> routes) {
            this.routes = routes;
            return this;
        }
        public Builder routes(@Nullable List<RouteTableRouteGetArgs> routes) {
            this.routes = Output.ofNullable(routes);
            return this;
        }
        public Builder routes(RouteTableRouteGetArgs... routes) {
            return routes(List.of(routes));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Output.ofNullable(vpcId);
            return this;
        }        public RouteTableState build() {
            return new RouteTableState(arn, ownerId, propagatingVgws, routes, tags, tagsAll, vpcId);
        }
    }
}