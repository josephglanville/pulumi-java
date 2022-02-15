// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.DiskIamMemberArgs;
import io.pulumi.gcp.compute.inputs.DiskIamMemberState;
import io.pulumi.gcp.compute.outputs.DiskIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/diskIamMember:DiskIamMember")
public class DiskIamMember extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=DiskIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ DiskIamMemberCondition> condition;

    public Output</* @Nullable */ DiskIamMemberCondition> getCondition() {
        return this.condition;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    public Output<String> getZone() {
        return this.zone;
    }

    public DiskIamMember(String name, DiskIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/diskIamMember:DiskIamMember", name, args == null ? DiskIamMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DiskIamMember(String name, Input<String> id, @Nullable DiskIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/diskIamMember:DiskIamMember", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DiskIamMember get(String name, Input<String> id, @Nullable DiskIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DiskIamMember(name, id, state, options);
    }
}