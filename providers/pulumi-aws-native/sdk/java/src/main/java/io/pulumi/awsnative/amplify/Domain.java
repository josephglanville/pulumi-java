// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.amplify.DomainArgs;
import io.pulumi.awsnative.amplify.outputs.DomainSubDomainSetting;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::Amplify::Domain resource allows you to connect a custom domain to your app.
 * 
 */
@ResourceType(type="aws-native:amplify:Domain")
public class Domain extends io.pulumi.resources.CustomResource {
    @Export(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    public Output<String> getAppId() {
        return this.appId;
    }
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="autoSubDomainCreationPatterns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> autoSubDomainCreationPatterns;

    public Output</* @Nullable */ List<String>> getAutoSubDomainCreationPatterns() {
        return this.autoSubDomainCreationPatterns;
    }
    @Export(name="autoSubDomainIAMRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoSubDomainIAMRole;

    public Output</* @Nullable */ String> getAutoSubDomainIAMRole() {
        return this.autoSubDomainIAMRole;
    }
    @Export(name="certificateRecord", type=String.class, parameters={})
    private Output<String> certificateRecord;

    public Output<String> getCertificateRecord() {
        return this.certificateRecord;
    }
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName;
    }
    @Export(name="domainStatus", type=String.class, parameters={})
    private Output<String> domainStatus;

    public Output<String> getDomainStatus() {
        return this.domainStatus;
    }
    @Export(name="enableAutoSubDomain", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAutoSubDomain;

    public Output</* @Nullable */ Boolean> getEnableAutoSubDomain() {
        return this.enableAutoSubDomain;
    }
    @Export(name="statusReason", type=String.class, parameters={})
    private Output<String> statusReason;

    public Output<String> getStatusReason() {
        return this.statusReason;
    }
    @Export(name="subDomainSettings", type=List.class, parameters={DomainSubDomainSetting.class})
    private Output<List<DomainSubDomainSetting>> subDomainSettings;

    public Output<List<DomainSubDomainSetting>> getSubDomainSettings() {
        return this.subDomainSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, DomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:amplify:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:amplify:Domain", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Domain get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, options);
    }
}
