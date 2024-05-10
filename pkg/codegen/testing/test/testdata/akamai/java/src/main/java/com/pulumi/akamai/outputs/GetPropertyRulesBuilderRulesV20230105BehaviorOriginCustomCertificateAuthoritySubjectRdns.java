// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns {
    private @Nullable String c;
    private @Nullable String cn;
    private @Nullable String o;
    private @Nullable String ou;

    private GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns() {}
    public Optional<String> c() {
        return Optional.ofNullable(this.c);
    }
    public Optional<String> cn() {
        return Optional.ofNullable(this.cn);
    }
    public Optional<String> o() {
        return Optional.ofNullable(this.o);
    }
    public Optional<String> ou() {
        return Optional.ofNullable(this.ou);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String c;
        private @Nullable String cn;
        private @Nullable String o;
        private @Nullable String ou;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.c = defaults.c;
    	      this.cn = defaults.cn;
    	      this.o = defaults.o;
    	      this.ou = defaults.ou;
        }

        @CustomType.Setter
        public Builder c(@Nullable String c) {

            this.c = c;
            return this;
        }
        @CustomType.Setter
        public Builder cn(@Nullable String cn) {

            this.cn = cn;
            return this;
        }
        @CustomType.Setter
        public Builder o(@Nullable String o) {

            this.o = o;
            return this;
        }
        @CustomType.Setter
        public Builder ou(@Nullable String ou) {

            this.ou = ou;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateAuthoritySubjectRdns();
            _resultValue.c = c;
            _resultValue.cn = cn;
            _resultValue.o = o;
            _resultValue.ou = ou;
            return _resultValue;
        }
    }
}
