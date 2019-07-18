package ac.kr.ajou.dirt2;

import java.util.HashSet;
import java.util.Set;

public class IpAddressMacAddress {

    // single ip, single mac, accountId, ip + mac
    public Set<String> process(PcBangEvent pbe) {
        Set<String> combinedIdentification = new HashSet<String>();
        buildForSingle(pbe, combinedIdentification);
        // single mac
        buildForsingleMac(pbe, combinedIdentification);
        // accountId
        buildForaccountId(pbe, combinedIdentification);
        // ip + mac
        buildForIpMac(pbe, combinedIdentification);

        return combinedIdentification;
    }

    private void buildForIpMac(PcBangEvent pbe, Set<String> combinedIdentification) {
        if (isaValidMac(pbe)) {
            if (isValidAccountId(pbe.getIp())) {
                String[] macAddresses = pbe.getMac().split(",");
                if (macAddresses.length <= 100) {
                    for (int i = 0; i < macAddresses.length; i++) {
                        combinedIdentification.add(pbe.getIp() + macAddresses[i]);
                    }
                }
            }
        }
    }



    private void buildForaccountId(PcBangEvent pbe, Set<String> combinedIdentification) {
        if (isValidAccountId(pbe.getAccountId())) {
            if (!pbe.getAccountId().equals("0")) {
                combinedIdentification.add(pbe.getAccountId());
            } else {
                System.out.println("Account id can't be 0");
            }
        }
            System.out.println("Account is is null or empty");

    }

    private boolean isValidAccountId(String accountId) {
        return accountId != null && !accountId.isEmpty();
    }

    private void buildForsingleMac(PcBangEvent pbe, Set<String> combinedIdentification) {
        if (isValidMac(pbe.getMac())) {
            String[] macAddresses = pbe.getMac().split(",");
            if (macAddresses.length <= 100) {
                for (int i = 0; i < macAddresses.length; i++) {
                    combinedIdentification.add(macAddresses[i]);
                }
            } else {
                System.out.println("Mac address too many");
            }
        }
            System.out.println("Mac address is wrong");

    }

    private boolean isValidMac(String mac) {
        return mac != null && !mac.isEmpty();
    }

    private void buildForSingle(PcBangEvent pbe, Set<String> combinedIdentification) {
        // single IP
        if (pbe.getIp() != null) {
            combinedIdentification.add(pbe.getIp());
        }
    }
}
