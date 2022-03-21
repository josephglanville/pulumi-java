// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RouteAsPathResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouteAsPathResponse Empty = new RouteAsPathResponse();

    /**
     * The AS numbers of the AS Path.
     * 
     */
    @Import(name="asLists", required=true)
      private final List<Integer> asLists;

    public List<Integer> getAsLists() {
        return this.asLists;
    }

    /**
     * The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
     * 
     */
    @Import(name="pathSegmentType", required=true)
      private final String pathSegmentType;

    public String getPathSegmentType() {
        return this.pathSegmentType;
    }

    public RouteAsPathResponse(
        List<Integer> asLists,
        String pathSegmentType) {
        this.asLists = Objects.requireNonNull(asLists, "expected parameter 'asLists' to be non-null");
        this.pathSegmentType = Objects.requireNonNull(pathSegmentType, "expected parameter 'pathSegmentType' to be non-null");
    }

    private RouteAsPathResponse() {
        this.asLists = List.of();
        this.pathSegmentType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteAsPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> asLists;
        private String pathSegmentType;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteAsPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asLists = defaults.asLists;
    	      this.pathSegmentType = defaults.pathSegmentType;
        }

        public Builder asLists(List<Integer> asLists) {
            this.asLists = Objects.requireNonNull(asLists);
            return this;
        }
        public Builder asLists(Integer... asLists) {
            return asLists(List.of(asLists));
        }
        public Builder pathSegmentType(String pathSegmentType) {
            this.pathSegmentType = Objects.requireNonNull(pathSegmentType);
            return this;
        }        public RouteAsPathResponse build() {
            return new RouteAsPathResponse(asLists, pathSegmentType);
        }
    }
}
