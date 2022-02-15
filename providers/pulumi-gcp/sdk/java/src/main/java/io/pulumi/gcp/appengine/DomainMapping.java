// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.appengine.DomainMappingArgs;
import io.pulumi.gcp.appengine.inputs.DomainMappingState;
import io.pulumi.gcp.appengine.outputs.DomainMappingResourceRecord;
import io.pulumi.gcp.appengine.outputs.DomainMappingSslSettings;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:appengine/domainMapping:DomainMapping")
public class DomainMapping extends io.pulumi.resources.CustomResource {
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="overrideStrategy", type=String.class, parameters={})
    private Output</* @Nullable */ String> overrideStrategy;

    public Output</* @Nullable */ String> getOverrideStrategy() {
        return this.overrideStrategy;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="resourceRecords", type=List.class, parameters={DomainMappingResourceRecord.class})
    private Output<List<DomainMappingResourceRecord>> resourceRecords;

    public Output<List<DomainMappingResourceRecord>> getResourceRecords() {
        return this.resourceRecords;
    }
    @OutputExport(name="sslSettings", type=DomainMappingSslSettings.class, parameters={})
    private Output</* @Nullable */ DomainMappingSslSettings> sslSettings;

    public Output</* @Nullable */ DomainMappingSslSettings> getSslSettings() {
        return this.sslSettings;
    }

    public DomainMapping(String name, DomainMappingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/domainMapping:DomainMapping", name, args == null ? DomainMappingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DomainMapping(String name, Input<String> id, @Nullable DomainMappingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/domainMapping:DomainMapping", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DomainMapping get(String name, Input<String> id, @Nullable DomainMappingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainMapping(name, id, state, options);
    }
}