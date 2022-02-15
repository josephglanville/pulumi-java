// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicenetworking;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.servicenetworking.PeeredDnsDomainArgs;
import io.pulumi.gcp.servicenetworking.inputs.PeeredDnsDomainState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:servicenetworking/peeredDnsDomain:PeeredDnsDomain")
public class PeeredDnsDomain extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dnsSuffix", type=String.class, parameters={})
    private Output<String> dnsSuffix;

    public Output<String> getDnsSuffix() {
        return this.dnsSuffix;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    public Output<String> getNetwork() {
        return this.network;
    }
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    public Output<String> getParent() {
        return this.parent;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="service", type=String.class, parameters={})
    private Output</* @Nullable */ String> service;

    public Output</* @Nullable */ String> getService() {
        return this.service;
    }

    public PeeredDnsDomain(String name, PeeredDnsDomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicenetworking/peeredDnsDomain:PeeredDnsDomain", name, args == null ? PeeredDnsDomainArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PeeredDnsDomain(String name, Input<String> id, @Nullable PeeredDnsDomainState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicenetworking/peeredDnsDomain:PeeredDnsDomain", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PeeredDnsDomain get(String name, Input<String> id, @Nullable PeeredDnsDomainState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PeeredDnsDomain(name, id, state, options);
    }
}