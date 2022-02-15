// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dns.PolicyArgs;
import io.pulumi.gcp.dns.inputs.PolicyState;
import io.pulumi.gcp.dns.outputs.PolicyAlternativeNameServerConfig;
import io.pulumi.gcp.dns.outputs.PolicyNetwork;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:dns/policy:Policy")
public class Policy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="alternativeNameServerConfig", type=PolicyAlternativeNameServerConfig.class, parameters={})
    private Output</* @Nullable */ PolicyAlternativeNameServerConfig> alternativeNameServerConfig;

    public Output</* @Nullable */ PolicyAlternativeNameServerConfig> getAlternativeNameServerConfig() {
        return this.alternativeNameServerConfig;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="enableInboundForwarding", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableInboundForwarding;

    public Output</* @Nullable */ Boolean> getEnableInboundForwarding() {
        return this.enableInboundForwarding;
    }
    @OutputExport(name="enableLogging", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableLogging;

    public Output</* @Nullable */ Boolean> getEnableLogging() {
        return this.enableLogging;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="networks", type=List.class, parameters={PolicyNetwork.class})
    private Output</* @Nullable */ List<PolicyNetwork>> networks;

    public Output</* @Nullable */ List<PolicyNetwork>> getNetworks() {
        return this.networks;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    public Policy(String name, @Nullable PolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dns/policy:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Policy(String name, Input<String> id, @Nullable PolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dns/policy:Policy", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Policy get(String name, Input<String> id, @Nullable PolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, state, options);
    }
}