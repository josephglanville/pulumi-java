// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppCookieStickinessPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppCookieStickinessPolicyArgs Empty = new AppCookieStickinessPolicyArgs();

    /**
     * The application cookie whose lifetime the ELB's cookie should follow.
     * 
     */
    @Import(name="cookieName", required=true)
      private final Output<String> cookieName;

    public Output<String> getCookieName() {
        return this.cookieName;
    }

    /**
     * The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    @Import(name="lbPort", required=true)
      private final Output<Integer> lbPort;

    public Output<Integer> getLbPort() {
        return this.lbPort;
    }

    /**
     * The name of load balancer to which the policy
     * should be attached.
     * 
     */
    @Import(name="loadBalancer", required=true)
      private final Output<String> loadBalancer;

    public Output<String> getLoadBalancer() {
        return this.loadBalancer;
    }

    /**
     * The name of the stickiness policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public AppCookieStickinessPolicyArgs(
        Output<String> cookieName,
        Output<Integer> lbPort,
        Output<String> loadBalancer,
        @Nullable Output<String> name) {
        this.cookieName = Objects.requireNonNull(cookieName, "expected parameter 'cookieName' to be non-null");
        this.lbPort = Objects.requireNonNull(lbPort, "expected parameter 'lbPort' to be non-null");
        this.loadBalancer = Objects.requireNonNull(loadBalancer, "expected parameter 'loadBalancer' to be non-null");
        this.name = name;
    }

    private AppCookieStickinessPolicyArgs() {
        this.cookieName = Codegen.empty();
        this.lbPort = Codegen.empty();
        this.loadBalancer = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppCookieStickinessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cookieName;
        private Output<Integer> lbPort;
        private Output<String> loadBalancer;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AppCookieStickinessPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieName = defaults.cookieName;
    	      this.lbPort = defaults.lbPort;
    	      this.loadBalancer = defaults.loadBalancer;
    	      this.name = defaults.name;
        }

        public Builder cookieName(Output<String> cookieName) {
            this.cookieName = Objects.requireNonNull(cookieName);
            return this;
        }
        public Builder cookieName(String cookieName) {
            this.cookieName = Output.of(Objects.requireNonNull(cookieName));
            return this;
        }
        public Builder lbPort(Output<Integer> lbPort) {
            this.lbPort = Objects.requireNonNull(lbPort);
            return this;
        }
        public Builder lbPort(Integer lbPort) {
            this.lbPort = Output.of(Objects.requireNonNull(lbPort));
            return this;
        }
        public Builder loadBalancer(Output<String> loadBalancer) {
            this.loadBalancer = Objects.requireNonNull(loadBalancer);
            return this;
        }
        public Builder loadBalancer(String loadBalancer) {
            this.loadBalancer = Output.of(Objects.requireNonNull(loadBalancer));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public AppCookieStickinessPolicyArgs build() {
            return new AppCookieStickinessPolicyArgs(cookieName, lbPort, loadBalancer, name);
        }
    }
}
