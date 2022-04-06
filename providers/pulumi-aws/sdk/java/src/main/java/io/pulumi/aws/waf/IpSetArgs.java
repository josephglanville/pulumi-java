// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.waf.inputs.IpSetIpSetDescriptorArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IpSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpSetArgs Empty = new IpSetArgs();

    /**
     * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
     * 
     */
    @Import(name="ipSetDescriptors")
      private final @Nullable Output<List<IpSetIpSetDescriptorArgs>> ipSetDescriptors;

    public Output<List<IpSetIpSetDescriptorArgs>> getIpSetDescriptors() {
        return this.ipSetDescriptors == null ? Output.empty() : this.ipSetDescriptors;
    }

    /**
     * The name or description of the IPSet.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public IpSetArgs(
        @Nullable Output<List<IpSetIpSetDescriptorArgs>> ipSetDescriptors,
        @Nullable Output<String> name) {
        this.ipSetDescriptors = ipSetDescriptors;
        this.name = name;
    }

    private IpSetArgs() {
        this.ipSetDescriptors = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<IpSetIpSetDescriptorArgs>> ipSetDescriptors;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(IpSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipSetDescriptors = defaults.ipSetDescriptors;
    	      this.name = defaults.name;
        }

        public Builder ipSetDescriptors(@Nullable Output<List<IpSetIpSetDescriptorArgs>> ipSetDescriptors) {
            this.ipSetDescriptors = ipSetDescriptors;
            return this;
        }
        public Builder ipSetDescriptors(@Nullable List<IpSetIpSetDescriptorArgs> ipSetDescriptors) {
            this.ipSetDescriptors = Output.ofNullable(ipSetDescriptors);
            return this;
        }
        public Builder ipSetDescriptors(IpSetIpSetDescriptorArgs... ipSetDescriptors) {
            return ipSetDescriptors(List.of(ipSetDescriptors));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public IpSetArgs build() {
            return new IpSetArgs(ipSetDescriptors, name);
        }
    }
}