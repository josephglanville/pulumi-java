// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.iam_v1.ProviderArgs;
import io.pulumi.googlenative.iam_v1.outputs.AwsResponse;
import io.pulumi.googlenative.iam_v1.outputs.OidcResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new WorkloadIdentityPoolProvider in a WorkloadIdentityPool. You cannot reuse the name of a deleted provider until 30 days after deletion.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:iam/v1:Provider")
public class Provider extends io.pulumi.resources.CustomResource {
    /**
     * [A Common Expression Language](https://opensource.google/projects/cel) expression, in plain text, to restrict what otherwise valid authentication credentials issued by the provider should not be accepted. The expression must output a boolean representing whether to allow the federation. The following keywords may be referenced in the expressions: * `assertion`: JSON representing the authentication credential issued by the provider. * `google`: The Google attributes mapped from the assertion in the `attribute_mappings`. * `attribute`: The custom attributes mapped from the assertion in the `attribute_mappings`. The maximum length of the attribute condition expression is 4096 characters. If unspecified, all valid authentication credential are accepted. The following example shows how to only allow credentials with a mapped `google.groups` value of `admins`: ```"'admins' in google.groups"```
     * 
     */
    @OutputExport(name="attributeCondition", type=String.class, parameters={})
    private Output<String> attributeCondition;

    /**
     * @return [A Common Expression Language](https://opensource.google/projects/cel) expression, in plain text, to restrict what otherwise valid authentication credentials issued by the provider should not be accepted. The expression must output a boolean representing whether to allow the federation. The following keywords may be referenced in the expressions: * `assertion`: JSON representing the authentication credential issued by the provider. * `google`: The Google attributes mapped from the assertion in the `attribute_mappings`. * `attribute`: The custom attributes mapped from the assertion in the `attribute_mappings`. The maximum length of the attribute condition expression is 4096 characters. If unspecified, all valid authentication credential are accepted. The following example shows how to only allow credentials with a mapped `google.groups` value of `admins`: ```"'admins' in google.groups"```
     * 
     */
    public Output<String> getAttributeCondition() {
        return this.attributeCondition;
    }
    /**
     * Maps attributes from authentication credentials issued by an external identity provider to Google Cloud attributes, such as `subject` and `segment`. Each key must be a string specifying the Google Cloud IAM attribute to map to. The following keys are supported: * `google.subject`: The principal IAM is authenticating. You can reference this value in IAM bindings. This is also the subject that appears in Cloud Logging logs. Cannot exceed 127 characters. * `google.groups`: Groups the external identity belongs to. You can grant groups access to resources using an IAM `principalSet` binding; access applies to all members of the group. You can also provide custom attributes by specifying `attribute.{custom_attribute}`, where `{custom_attribute}` is the name of the custom attribute to be mapped. You can define a maximum of 50 custom attributes. The maximum length of a mapped attribute key is 100 characters, and the key may only contain the characters [a-z0-9_]. You can reference these attributes in IAM policies to define fine-grained access for a workload to Google Cloud resources. For example: * `google.subject`: `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}` * `google.groups`: `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}` * `attribute.{custom_attribute}`: `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}` Each value must be a [Common Expression Language] (https://opensource.google/projects/cel) function that maps an identity provider credential to the normalized attribute specified by the corresponding map key. You can use the `assertion` keyword in the expression to access a JSON representation of the authentication credential issued by the provider. The maximum length of an attribute mapping expression is 2048 characters. When evaluated, the total size of all mapped attributes must not exceed 8KB. For AWS providers, if no attribute mapping is defined, the following default mapping applies: ```{ "google.subject":"assertion.arn", "attribute.aws_role": "assertion.arn.contains('assumed-role')" " ? assertion.arn.extract('{account_arn}assumed-role/')" " + 'assumed-role/'" " + assertion.arn.extract('assumed-role/{role_name}/')" " : assertion.arn", }``` If any custom attribute mappings are defined, they must include a mapping to the `google.subject` attribute. For OIDC providers, you must supply a custom mapping, which must include the `google.subject` attribute. For example, the following maps the `sub` claim of the incoming credential to the `subject` attribute on a Google token: ```{"google.subject": "assertion.sub"}```
     * 
     */
    @OutputExport(name="attributeMapping", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> attributeMapping;

    /**
     * @return Maps attributes from authentication credentials issued by an external identity provider to Google Cloud attributes, such as `subject` and `segment`. Each key must be a string specifying the Google Cloud IAM attribute to map to. The following keys are supported: * `google.subject`: The principal IAM is authenticating. You can reference this value in IAM bindings. This is also the subject that appears in Cloud Logging logs. Cannot exceed 127 characters. * `google.groups`: Groups the external identity belongs to. You can grant groups access to resources using an IAM `principalSet` binding; access applies to all members of the group. You can also provide custom attributes by specifying `attribute.{custom_attribute}`, where `{custom_attribute}` is the name of the custom attribute to be mapped. You can define a maximum of 50 custom attributes. The maximum length of a mapped attribute key is 100 characters, and the key may only contain the characters [a-z0-9_]. You can reference these attributes in IAM policies to define fine-grained access for a workload to Google Cloud resources. For example: * `google.subject`: `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}` * `google.groups`: `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}` * `attribute.{custom_attribute}`: `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}` Each value must be a [Common Expression Language] (https://opensource.google/projects/cel) function that maps an identity provider credential to the normalized attribute specified by the corresponding map key. You can use the `assertion` keyword in the expression to access a JSON representation of the authentication credential issued by the provider. The maximum length of an attribute mapping expression is 2048 characters. When evaluated, the total size of all mapped attributes must not exceed 8KB. For AWS providers, if no attribute mapping is defined, the following default mapping applies: ```{ "google.subject":"assertion.arn", "attribute.aws_role": "assertion.arn.contains('assumed-role')" " ? assertion.arn.extract('{account_arn}assumed-role/')" " + 'assumed-role/'" " + assertion.arn.extract('assumed-role/{role_name}/')" " : assertion.arn", }``` If any custom attribute mappings are defined, they must include a mapping to the `google.subject` attribute. For OIDC providers, you must supply a custom mapping, which must include the `google.subject` attribute. For example, the following maps the `sub` claim of the incoming credential to the `subject` attribute on a Google token: ```{"google.subject": "assertion.sub"}```
     * 
     */
    public Output<Map<String,String>> getAttributeMapping() {
        return this.attributeMapping;
    }
    /**
     * An Amazon Web Services identity provider.
     * 
     */
    @OutputExport(name="aws", type=AwsResponse.class, parameters={})
    private Output<AwsResponse> aws;

    /**
     * @return An Amazon Web Services identity provider.
     * 
     */
    public Output<AwsResponse> getAws() {
        return this.aws;
    }
    /**
     * A description for the provider. Cannot exceed 256 characters.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description for the provider. Cannot exceed 256 characters.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Whether the provider is disabled. You cannot use a disabled provider to exchange tokens. However, existing tokens still grant access.
     * 
     */
    @OutputExport(name="disabled", type=Boolean.class, parameters={})
    private Output<Boolean> disabled;

    /**
     * @return Whether the provider is disabled. You cannot use a disabled provider to exchange tokens. However, existing tokens still grant access.
     * 
     */
    public Output<Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * A display name for the provider. Cannot exceed 32 characters.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A display name for the provider. Cannot exceed 32 characters.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The resource name of the provider.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the provider.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * An OpenId Connect 1.0 identity provider.
     * 
     */
    @OutputExport(name="oidc", type=OidcResponse.class, parameters={})
    private Output<OidcResponse> oidc;

    /**
     * @return An OpenId Connect 1.0 identity provider.
     * 
     */
    public Output<OidcResponse> getOidc() {
        return this.oidc;
    }
    /**
     * The state of the provider.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the provider.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, ProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iam/v1:Provider", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Provider(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iam/v1:Provider", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
    public static Provider get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Provider(name, id, options);
    }
}
