// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.events.ArchiveArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Events::Archive
 * 
 */
@ResourceType(type="aws-native:events:Archive")
public class Archive extends io.pulumi.resources.CustomResource {
    @OutputExport(name="archiveName", type=String.class, parameters={})
    private Output<String> archiveName;

    public Output<String> getArchiveName() {
        return this.archiveName;
    }
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="eventPattern", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> eventPattern;

    public Output</* @Nullable */ Object> getEventPattern() {
        return this.eventPattern;
    }
    @OutputExport(name="retentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionDays;

    public Output</* @Nullable */ Integer> getRetentionDays() {
        return this.retentionDays;
    }
    @OutputExport(name="sourceArn", type=String.class, parameters={})
    private Output<String> sourceArn;

    public Output<String> getSourceArn() {
        return this.sourceArn;
    }

    public interface BuilderApplicator {
        public void apply(ArchiveArgs.Builder a);
    }
    private static io.pulumi.awsnative.events.ArchiveArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.events.ArchiveArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Archive(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Archive(String name) {
        this(name, ArchiveArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Archive(String name, ArchiveArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Archive(String name, ArchiveArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:events:Archive", name, args == null ? ArchiveArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Archive(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:events:Archive", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Archive get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Archive(name, id, options);
    }
}
