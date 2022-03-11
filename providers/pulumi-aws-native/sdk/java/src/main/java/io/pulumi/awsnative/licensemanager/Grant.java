// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.licensemanager.GrantArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 */
@ResourceType(type="aws-native:licensemanager:Grant")
public class Grant extends io.pulumi.resources.CustomResource {
    @OutputExport(name="allowedOperations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedOperations;

    public Output</* @Nullable */ List<String>> getAllowedOperations() {
        return this.allowedOperations;
    }
    /**
     * Arn of the grant.
     * 
     */
    @OutputExport(name="grantArn", type=String.class, parameters={})
    private Output<String> grantArn;

    /**
     * @return Arn of the grant.
     * 
     */
    public Output<String> getGrantArn() {
        return this.grantArn;
    }
    /**
     * Name for the created Grant.
     * 
     */
    @OutputExport(name="grantName", type=String.class, parameters={})
    private Output</* @Nullable */ String> grantName;

    /**
     * @return Name for the created Grant.
     * 
     */
    public Output</* @Nullable */ String> getGrantName() {
        return this.grantName;
    }
    /**
     * Home region for the created grant.
     * 
     */
    @OutputExport(name="homeRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> homeRegion;

    /**
     * @return Home region for the created grant.
     * 
     */
    public Output</* @Nullable */ String> getHomeRegion() {
        return this.homeRegion;
    }
    /**
     * License Arn for the grant.
     * 
     */
    @OutputExport(name="licenseArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseArn;

    /**
     * @return License Arn for the grant.
     * 
     */
    public Output</* @Nullable */ String> getLicenseArn() {
        return this.licenseArn;
    }
    @OutputExport(name="principals", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> principals;

    public Output</* @Nullable */ List<String>> getPrincipals() {
        return this.principals;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * The version of the grant.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version of the grant.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable GrantArgs.Builder a);
    }
    private static io.pulumi.awsnative.licensemanager.GrantArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.licensemanager.GrantArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Grant(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Grant(String name) {
        this(name, GrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Grant(String name, @Nullable GrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Grant(String name, @Nullable GrantArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:licensemanager:Grant", name, args == null ? GrantArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Grant(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:licensemanager:Grant", name, null, makeResourceOptions(options, id));
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
    public static Grant get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Grant(name, id, options);
    }
}
