// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnterpriseKeyWebSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseKeyWebSettingsArgs Empty = new EnterpriseKeyWebSettingsArgs();

    /**
     * If set to true, it means allowed_domains will not be enforced.
     * 
     */
    @Import(name="allowAllDomains")
      private final @Nullable Output<Boolean> allowAllDomains;

    public Output<Boolean> getAllowAllDomains() {
        return this.allowAllDomains == null ? Codegen.empty() : this.allowAllDomains;
    }

    /**
     * If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
     * 
     */
    @Import(name="allowAmpTraffic")
      private final @Nullable Output<Boolean> allowAmpTraffic;

    public Output<Boolean> getAllowAmpTraffic() {
        return this.allowAmpTraffic == null ? Codegen.empty() : this.allowAmpTraffic;
    }

    /**
     * Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: 'example.com' or 'subdomain.example.com'
     * 
     */
    @Import(name="allowedDomains")
      private final @Nullable Output<List<String>> allowedDomains;

    public Output<List<String>> getAllowedDomains() {
        return this.allowedDomains == null ? Codegen.empty() : this.allowedDomains;
    }

    /**
     * Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE. Possible values: CHALLENGE_SECURITY_PREFERENCE_UNSPECIFIED, USABILITY, BALANCE, SECURITY
     * 
     */
    @Import(name="challengeSecurityPreference")
      private final @Nullable Output<String> challengeSecurityPreference;

    public Output<String> getChallengeSecurityPreference() {
        return this.challengeSecurityPreference == null ? Codegen.empty() : this.challengeSecurityPreference;
    }

    /**
     * Required. Describes how this key is integrated with the website. Possible values: SCORE, CHECKBOX, INVISIBLE
     * 
     */
    @Import(name="integrationType", required=true)
      private final Output<String> integrationType;

    public Output<String> getIntegrationType() {
        return this.integrationType;
    }

    public EnterpriseKeyWebSettingsArgs(
        @Nullable Output<Boolean> allowAllDomains,
        @Nullable Output<Boolean> allowAmpTraffic,
        @Nullable Output<List<String>> allowedDomains,
        @Nullable Output<String> challengeSecurityPreference,
        Output<String> integrationType) {
        this.allowAllDomains = allowAllDomains;
        this.allowAmpTraffic = allowAmpTraffic;
        this.allowedDomains = allowedDomains;
        this.challengeSecurityPreference = challengeSecurityPreference;
        this.integrationType = Objects.requireNonNull(integrationType, "expected parameter 'integrationType' to be non-null");
    }

    private EnterpriseKeyWebSettingsArgs() {
        this.allowAllDomains = Codegen.empty();
        this.allowAmpTraffic = Codegen.empty();
        this.allowedDomains = Codegen.empty();
        this.challengeSecurityPreference = Codegen.empty();
        this.integrationType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyWebSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowAllDomains;
        private @Nullable Output<Boolean> allowAmpTraffic;
        private @Nullable Output<List<String>> allowedDomains;
        private @Nullable Output<String> challengeSecurityPreference;
        private Output<String> integrationType;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyWebSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllDomains = defaults.allowAllDomains;
    	      this.allowAmpTraffic = defaults.allowAmpTraffic;
    	      this.allowedDomains = defaults.allowedDomains;
    	      this.challengeSecurityPreference = defaults.challengeSecurityPreference;
    	      this.integrationType = defaults.integrationType;
        }

        public Builder allowAllDomains(@Nullable Output<Boolean> allowAllDomains) {
            this.allowAllDomains = allowAllDomains;
            return this;
        }
        public Builder allowAllDomains(@Nullable Boolean allowAllDomains) {
            this.allowAllDomains = Codegen.ofNullable(allowAllDomains);
            return this;
        }
        public Builder allowAmpTraffic(@Nullable Output<Boolean> allowAmpTraffic) {
            this.allowAmpTraffic = allowAmpTraffic;
            return this;
        }
        public Builder allowAmpTraffic(@Nullable Boolean allowAmpTraffic) {
            this.allowAmpTraffic = Codegen.ofNullable(allowAmpTraffic);
            return this;
        }
        public Builder allowedDomains(@Nullable Output<List<String>> allowedDomains) {
            this.allowedDomains = allowedDomains;
            return this;
        }
        public Builder allowedDomains(@Nullable List<String> allowedDomains) {
            this.allowedDomains = Codegen.ofNullable(allowedDomains);
            return this;
        }
        public Builder allowedDomains(String... allowedDomains) {
            return allowedDomains(List.of(allowedDomains));
        }
        public Builder challengeSecurityPreference(@Nullable Output<String> challengeSecurityPreference) {
            this.challengeSecurityPreference = challengeSecurityPreference;
            return this;
        }
        public Builder challengeSecurityPreference(@Nullable String challengeSecurityPreference) {
            this.challengeSecurityPreference = Codegen.ofNullable(challengeSecurityPreference);
            return this;
        }
        public Builder integrationType(Output<String> integrationType) {
            this.integrationType = Objects.requireNonNull(integrationType);
            return this;
        }
        public Builder integrationType(String integrationType) {
            this.integrationType = Output.of(Objects.requireNonNull(integrationType));
            return this;
        }        public EnterpriseKeyWebSettingsArgs build() {
            return new EnterpriseKeyWebSettingsArgs(allowAllDomains, allowAmpTraffic, allowedDomains, challengeSecurityPreference, integrationType);
        }
    }
}
