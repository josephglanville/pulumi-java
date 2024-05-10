// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns();

    @Import(name="c")
    private @Nullable String c;

    public Optional<String> c() {
        return Optional.ofNullable(this.c);
    }

    @Import(name="cn")
    private @Nullable String cn;

    public Optional<String> cn() {
        return Optional.ofNullable(this.cn);
    }

    @Import(name="o")
    private @Nullable String o;

    public Optional<String> o() {
        return Optional.ofNullable(this.o);
    }

    @Import(name="ou")
    private @Nullable String ou;

    public Optional<String> ou() {
        return Optional.ofNullable(this.ou);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns(GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns $) {
        this.c = $.c;
        this.cn = $.cn;
        this.o = $.o;
        this.ou = $.ou;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns(Objects.requireNonNull(defaults));
        }

        public Builder c(@Nullable String c) {
            $.c = c;
            return this;
        }

        public Builder cn(@Nullable String cn) {
            $.cn = cn;
            return this;
        }

        public Builder o(@Nullable String o) {
            $.o = o;
            return this;
        }

        public Builder ou(@Nullable String ou) {
            $.ou = ou;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns build() {
            return $;
        }
    }

}
